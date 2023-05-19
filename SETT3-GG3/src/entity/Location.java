package entity;

public class Location {
private int id;
private String Nome;
private String Citta;
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
