package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cataloghi")
public class Catalogo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private String ISBN;
private String titolo;
private String AnnoPubblicazione;
private int NumeroPagine;


public Catalogo() {
	super();
}

public Catalogo(String iSBN, String titolo, String AnnoPubblicazione, int numeroPagine) {
	super();
	ISBN = iSBN;
	this.titolo = titolo;
	this.AnnoPubblicazione = AnnoPubblicazione;
	NumeroPagine = numeroPagine;
	

}

@Override
public String toString() {
	return "Catalogo [ISBN=" + ISBN + ", titolo=" + titolo + ", AnnoPubblicazione=" + AnnoPubblicazione
			+ ", NumeroPagine=" + NumeroPagine + "]";
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getTitolo() {
	return titolo;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}

public String getAnnoPubblicazione() {
	return AnnoPubblicazione;
}

public void setAnnoPubblicazione(String AnnoPubblicazione) {
	this.AnnoPubblicazione = AnnoPubblicazione;
}

public int getNumeroPagine() {
	return NumeroPagine;
}

public void setNumeroPagine(int numeroPagine) {
	NumeroPagine = numeroPagine;
}


}
