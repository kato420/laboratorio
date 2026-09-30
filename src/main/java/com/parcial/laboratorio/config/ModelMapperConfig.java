package com.parcial.laboratorio.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// gh repo create --source=. --public
// prueba de integracion protegida por JWT
// con PostgreSQL mediante testcontainer

@Configuration
public class ModelMapperConfig {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
