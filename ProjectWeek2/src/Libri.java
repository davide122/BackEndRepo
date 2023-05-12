
public class Libri extends Catalogo{
private String autore;
private String genere;
	public Libri(String iSBN, String titolo, String AnnoPubblicazione, int numeroPagine,String autore, String genere) {
		super(iSBN, titolo, AnnoPubblicazione, numeroPagine);
		
		
		
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}

}
