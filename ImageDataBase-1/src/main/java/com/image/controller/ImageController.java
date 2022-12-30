package com.image.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.image.service.ImageService;

@RestController
public class ImageController {

	@Autowired
	private ImageService service;
	
	@PostMapping("/Images")
	public ResponseEntity<String> uploadImage(@RequestParam("image") MultipartFile file) throws IOException
	{
		String str = service.uploadImage(file);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("/Images/{image_name}")
	public ResponseEntity<byte[]> downloadImage(@PathVariable("image_name") String filename) throws IOException
	{
		byte[] str = service.downloadImage(filename);
		
		 return ResponseEntity.status(HttpStatus.OK)
	                .contentType(MediaType.valueOf("image/png"))
	                .body(str);
	}
	
	
}
