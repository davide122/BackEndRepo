import java.util.Map;
import java.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import java.util.ArrayList;
public class Archive {
	static File file = new File("SaveCV/saveo.txt");
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
			System.out.println("*******Search  element by date ********");
		 List<Catalogo> found = archive.values().stream()
			        .filter(Archive -> Archive.getAnnoPubblicazione().equals(AnnoPubblicazione))
			        .collect(Collectors.toList());
		 if(found.isEmpty()) {
			 System.out.println("errore nella ricerca");
		 }else {
			 		System.out.println(found);
		 }
		}catch(Exception o){
			 System.out.println("errore nell'inserimento");
		}
	}
	
	
	
	
	public List<Libri> SearchAuthor(String autore) {
		  return archive.values().stream()
	        .filter(Archive -> Archive instanceof Libri && ((Libri) Archive).getAutore() != null && ((Libri) Archive).getAutore().equals(autore))
	        .map(Archive -> (Libri) Archive)
	        .collect(Collectors.toList());
		 
	
	}
	
	
	public void SaveData() {
		try {
	        List<String> values = new ArrayList<>();
	        for (Catalogo catalogo : archive.values()) {
	            values.add(catalogo.toString());
	        }
	        FileUtils.writeLines(file, values);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
}
