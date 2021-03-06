package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Adresse implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_adresse;
	private String pays;
	private String ville;
	private String rue;
}
