package com.andrebovis.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrebovis.course.entities.User;
import com.andrebovis.course.repositories.UserReposotory;

@Service
public class UserService {
	
	@Autowired
	private UserReposotory repository ;
	
	public List<User> findAll(){
		return repository.findAll()
;}

	public User findById(Long id) {
	Optional<User> obj = repository.findById(id);
	return obj.get();
	}
}
