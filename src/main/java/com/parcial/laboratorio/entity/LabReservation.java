package com.parcial.laboratorio.entity;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LabReservation {
  // autogenerado
  Long id;
  Long slotld;
  Long studentId;
  String purpose;
  ZonedDateTime reservedAt;
  String status;
}
