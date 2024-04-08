package com.rhadazezaibatsu.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhadazezaibatsu.cursospringboot.entities.Order;

@Repository //Comando opcional
public interface OrderRepository extends JpaRepository<Order, Long> {

}
