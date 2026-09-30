package com.parcial.laboratorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.laboratorio.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
