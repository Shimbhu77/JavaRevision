package com.image.service;

import java.io.IOException;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.image.model.Image;
import com.image.repository.ImageDataRepository;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageDataRepository imageDataRepository;
	
	@Override
	public String uploadImage(MultipartFile file) throws IOException {
		
		
		imageDataRepository.save(Image.builder().name(file.getOriginalFilename())
				.type(file.getContentType())
				.imageData(ImageUtil.compressImage(file.getBytes())).build());
		
		return "File uploaded Successfully "+file.getOriginalFilename();
		
	}

	@Override
	public byte[] downloadImage(String file) throws IOException {
		
		Optional<Image> image = imageDataRepository.findByName(file);
		
		byte[] bytes = ImageUtil.decompressImage(image.get().getImageData());
		
		return bytes;
		
	}

}
