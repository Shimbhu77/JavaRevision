package com.image.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.image.model.Image;

@Repository
public interface ImageDataRepository  extends JpaRepository<Image,Long>{

	public Optional<Image> findByName(String name);
}
