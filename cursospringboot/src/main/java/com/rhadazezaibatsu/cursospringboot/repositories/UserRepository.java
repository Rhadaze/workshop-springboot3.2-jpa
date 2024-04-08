package com.rhadazezaibatsu.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rhadazezaibatsu.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
