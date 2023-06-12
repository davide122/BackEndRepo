package com.example.models;

import org.hibernate.annotations.ManyToAny;

import com.example.enumerations.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="postazioni")
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long codice_univoco;
	
private String descrizione;
@Enumerated(EnumType.STRING)
private TipoPostazione tipo;
private Integer numero_max_occupanti;

@ManyToOne
private Edificio edificio;

}
