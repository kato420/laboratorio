package com.parcial.laboratorio.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.parcial.laboratorio.DTO.UserRequestDTO;
import com.parcial.laboratorio.config.ModelMapperConfig;
import com.parcial.laboratorio.entity.User;
import com.parcial.laboratorio.repository.UserRepository;

@Service
public class UserService {

  private final UserRepository userRepository;
  private final ModelMapperConfig modelMapperConfig;

  public UserService(UserRepository userRepository, ModelMapperConfig modelMapperConfig) {
    this.modelMapperConfig = modelMapperConfig;
    this.userRepository = userRepository;
  }

  public User registrarUser(UserRequestDTO user) {
    User otro = modelMapperConfig.map(UserRequestDTO, User.class);

    return userRepository.save(otro);
  }
}
