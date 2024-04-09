package com.rhadazezaibatsu.cursospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhadazezaibatsu.cursospringboot.entities.Category;
import com.rhadazezaibatsu.cursospringboot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Optional<Category> findById(Long id) {
		Optional<Category> Obj = repository.findById(id);
		return Obj;
	}
}
