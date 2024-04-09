package com.rhadazezaibatsu.cursospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhadazezaibatsu.cursospringboot.entities.Product;
import com.rhadazezaibatsu.cursospringboot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Optional<Product> findById(Long id) {
		Optional<Product> Obj = repository.findById(id);
		return Obj;
	}
}
