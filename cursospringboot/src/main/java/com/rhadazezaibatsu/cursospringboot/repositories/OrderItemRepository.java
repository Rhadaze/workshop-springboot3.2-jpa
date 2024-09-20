package com.rhadazezaibatsu.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhadazezaibatsu.cursospringboot.entities.OrderItem;

@Repository // Comando opcional
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
