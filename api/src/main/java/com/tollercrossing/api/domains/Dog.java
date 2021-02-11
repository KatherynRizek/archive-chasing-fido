package com.tollercrossing.api.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "dogs")
public class Dog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  private Date dateOfBirth;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "breed_id", referencedColumnName = "id")
  private Breed breed;
}