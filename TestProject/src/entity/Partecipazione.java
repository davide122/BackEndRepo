package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@ManyToOne
private Persona persona;
private String Evento;
private Stato stato;




public Partecipazione() {
	super();
}
public Partecipazione(int id, Persona persona, String evento, Stato stato) {
	super();
	this.id = id;
	this.persona = persona;
	Evento = evento;
	this.stato = stato;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Persona getPersona() {
	return persona;
}
public void setPersona(Persona persona) {
	this.persona = persona;
}
public String getEvento() {
	return Evento;
}
public void setEvento(String evento) {
	Evento = evento;
}
public Stato getStato() {
	return stato;
}
public void setStato(Stato stato) {
	this.stato = stato;
}
@Override
public String toString() {
	return "Partecipazione [id=" + id + ", persona=" + persona + ", Evento=" + Evento + ", stato=" + stato + "]";
}

}
