package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
@Entity
@Table(name="riviste")
public class Riviste extends Catalogo {
	public Riviste() {
		super();
	}

	private  Periodicita periodicita ;
	public Riviste(String iSBN, String titolo, String AnnoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(iSBN, titolo, AnnoPubblicazione, numeroPagine);
		
		
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Riviste [periodicita=" + periodicita + "]";
	}
	
	
}
