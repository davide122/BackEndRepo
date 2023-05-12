import java.util.Map;

import java.util.HashMap;
public class Archive {

	private Map<String, Catalogo> archive;

	public  Archive() {
		this.archive = new HashMap<String, Catalogo>();	
		System.out.println("Controlla qui!!!!!");
		
	}
	
	public void Add(Catalogo NewEl) {
		System.out.println("*****ADD ELEMENT****");
		archive.put(NewEl.getISBN(),NewEl);
		System.out.println(archive);
		System.out.println("Ho aggiunto"+" "+ NewEl);
	}
	
	public void Remove(String ISBN) {
		archive.remove(ISBN);
		System.out.println("*******Remove ELEMENT ********");
		System.out.println(archive);
		System.out.println("rimosso correttamente"+" " + ISBN);
	}
	
	public void Search(String ISBN) {
		try {
			
		archive.get(ISBN);
		System.out.println("*******Search element ********");
		System.out.println(archive);
		if(archive.get(ISBN) != null) {
		System.out.println("elemento trovato"+" " + archive.get(ISBN));	
		}else {
			System.out.println("Mi dispiace Non ho trovato nulla con questa chiave" + ISBN);	
		}
		
		}catch(Exception a){
			System.out.println("Mi dispiace Non ho trovato nulla con questa chiave" + ISBN);	
		}
		
	}
	
	

	public void SearchDate(String AnnoPubblicazione) {
		try {
			
		archive.get(AnnoPubblicazione);
		System.out.println("*******Search Date ********");
		System.out.println(archive);
		if(archive.get(AnnoPubblicazione) != null) {
		System.out.println("elemento trovato"+" " + archive.get(AnnoPubblicazione));	
		}else {
			System.out.println("Mi dispiace Non ho trovato nulla con questa chiave" + AnnoPubblicazione);	
		}
		
		}catch(Exception a){
			System.out.println("Mi dispiace Non ho trovato nulla con questa chiave" + AnnoPubblicazione);	
		}
		
	}
	
	
	
	
	
}
