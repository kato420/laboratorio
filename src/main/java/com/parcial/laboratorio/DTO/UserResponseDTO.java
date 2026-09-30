package com.parcial.laboratorio.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserResponseDTO {

  @NotBlank
  String username;
  @NotBlank
  String email;
  @NotBlank
  // @Min(value = 0, message = "La edad no puede ser un numero negativo")
  String password;

}
