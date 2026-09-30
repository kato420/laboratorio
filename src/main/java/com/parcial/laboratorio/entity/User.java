package com.parcial.laboratorio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
  // autogenerado
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  // unico
  String username;
  // unico
  String email;
  // encriptado
  String password;
  // 3 roles
  String role;
}
