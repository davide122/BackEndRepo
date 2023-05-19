package entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "persone")
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id ;
	
	private String Nome;
	private  String Cognome;
	private String Email;
	private LocalDate Data_di_nascita;
	private Sesso sesso = Sesso.Maschio;
	@OneToMany
	private List<Partecipazione> partecipazione;
	
	
	
	public Persona(int id, String nome, String cognome, String email, LocalDate data_di_nascita, Sesso sesso,
			List<Partecipazione> partecipazione) {
		super();
		Id = id;
		Nome = nome;
		Cognome = cognome;
		Email = email;
		Data_di_nascita = data_di_nascita;
		this.sesso = sesso;
		this.partecipazione =partecipazione;
	}
	
	
	
	
	public Persona() {
		super();
	}




	public int getId() {
		return Id;
	}




	public void setId(int id) {
		Id = id;
	}




	public String getNome() {
		return Nome;
	}




	public void setNome(String nome) {
		Nome = nome;
	}




	public String getCognome() {
		return Cognome;
	}




	public void setCognome(String cognome) {
		Cognome = cognome;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public LocalDate getData_di_nascita() {
		return Data_di_nascita;
	}




	public void setData_di_nascita(LocalDate data_di_nascita) {
		Data_di_nascita = data_di_nascita;
	}




	public Sesso getSesso() {
		return sesso;
	}




	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}




	public List<Partecipazione> getPartecipazione() {
		return partecipazione;
	}




	public void setPartecipazione(List<Partecipazione> partecipazione) {
		this.partecipazione = partecipazione;
	}



	
	

}
