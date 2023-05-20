package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="utenti")
public class Utente {
private String Surname;
private LocalDate dataNascita;
@Id
private int numeroditessera;
public Utente() {
	super();
}
public Utente(String surname, LocalDate dataNascita,int numeroditessera) {
	super();
	Surname = surname;
	this.dataNascita = dataNascita;
	this.numeroditessera=numeroditessera;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public LocalDate getDataNascita() {
	return dataNascita;
}
public void setDataNascita(LocalDate dataNascita) {
	this.dataNascita = dataNascita;
}
public int getNumeroditessera() {
	return numeroditessera;
}
public void setNumeroditessera(int numeroditessera) {
	this.numeroditessera = numeroditessera;
}

}
