package com.tollercrossing.api.domains;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "breeds")
public class Breed {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String type;

  @OneToOne(mappedBy = "breed")
  private Dog dog;
}