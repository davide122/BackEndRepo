package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="prestiti")
public class Prestito  {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private long id;
	
	@ManyToOne
private Utente utente;
	
@Enumerated(EnumType.STRING)
private Elemento elemento;
@Column(name="inizioprestito")
private LocalDate InizioPrestito;
@Column(name="finedata")
private LocalDate FineData;
@Column(name="effettivo")
private LocalDate Effective;
public Prestito() {
	super();
}
public Prestito(Utente utente, Elemento elemento, LocalDate inizioPrestito, LocalDate effective) {
	super();
	this.utente = utente;
	this.elemento = elemento;
	InizioPrestito = inizioPrestito;
	Effective = effective;
}
public Utente getUtente() {
	return utente;
}
public void setUtente(Utente utente) {
	this.utente = utente;
}
public Elemento getElemento() {
	return elemento;
}
public void setElemento(Elemento elemento) {
	this.elemento = elemento;
}
public LocalDate getInizioPrestito() {
	return InizioPrestito;
}
public void setInizioPrestito(LocalDate inizioPrestito) {
	InizioPrestito = inizioPrestito;
}
public LocalDate getEffective() {
	return Effective;
}
public void setEffective(LocalDate effective) {
	Effective = effective;
}

public int getId() {
	return (int) id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Prestito [utente=" + utente + ", elemento=" + elemento + ", InizioPrestito=" + InizioPrestito
			+ ", FineData=" + FineData + ", Effective=" + Effective + "]";
}


}
