package com.parcial.laboratorio.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Laboratory {

  // autogenerado
  Long id;
  // unico
  String name;
  String location;
  // referencia a user
  Long managerId;
  // active mantenance
  String status;
}
