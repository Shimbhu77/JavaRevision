package com.shimbhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shimbhu.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	public User findByName(String name);
}
