package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String Nome;
private String Citta;



public Location() {
	super();
}
public Location(int id, String nome, String citta) {
	super();
	this.id = id;
	Nome = nome;
	Citta = citta;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getCitta() {
	return Citta;
}
public void setCitta(String citta) {
	Citta = citta;
}
@Override
public String toString() {
	return "Location [id=" + id + ", Nome=" + Nome + ", Citta=" + Citta + "]";
}

}
