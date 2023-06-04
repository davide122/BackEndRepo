package com.example.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="edifici")
public class Edificio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

private String nome;
private String indirizzo;
private String citta;
private List<Postazione> postazioni;
}
