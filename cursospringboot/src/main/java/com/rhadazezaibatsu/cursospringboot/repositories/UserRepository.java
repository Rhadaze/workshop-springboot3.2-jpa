package com.rhadazezaibatsu.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhadazezaibatsu.cursospringboot.entities.User;

@Repository // Comando opcional
public interface UserRepository extends JpaRepository<User, Long> {

}
