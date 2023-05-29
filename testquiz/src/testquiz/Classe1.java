package testquiz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classe1")
public class Classe1 {
String Name;
@Id
int id;
public Classe1() {
	super();
}
public Classe1(String name, int id) {
	super();
	Name = name;
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
