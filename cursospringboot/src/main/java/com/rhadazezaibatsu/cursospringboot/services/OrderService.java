package com.rhadazezaibatsu.cursospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhadazezaibatsu.cursospringboot.entities.Order;
import com.rhadazezaibatsu.cursospringboot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Optional<Order> findById(Long id) {
		Optional<Order> Obj = repository.findById(id);
		return Obj;
	}
}
