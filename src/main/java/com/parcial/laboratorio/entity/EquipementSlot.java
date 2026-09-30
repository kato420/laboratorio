package com.parcial.laboratorio.entity;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EquipementSlot {
  // autogenerado
  Long id;
  Long laboratoryId;
  String equipementCode;
  ZonedDateTime startTime;
  ZonedDateTime endTime;
  int capacity;
  String status;
}
