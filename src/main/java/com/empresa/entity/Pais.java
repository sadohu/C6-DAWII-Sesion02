package com.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPais;
	private String iso;
	private String nombre;
}
