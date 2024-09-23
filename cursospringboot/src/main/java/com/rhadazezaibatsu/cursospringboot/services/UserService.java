package com.rhadazezaibatsu.cursospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhadazezaibatsu.cursospringboot.entities.User;
import com.rhadazezaibatsu.cursospringboot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		Optional<User> Obj = repository.findById(id);
		return Obj;
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
