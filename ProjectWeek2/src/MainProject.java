
public class MainProject {

	public static void main(String[] args) {
//Riviste argomenti : String iSBN, String titolo, String annoPubblicazione, int numeroPagine, Periodicita periodicita
//LIBRI ARGOMENTI : String iSBN, String titolo, String annoPubblicazione, int numeroPagine,String autore, String genere
		Archive archive = new Archive();
		//add
		archive.Add(new Libri("10","il mio teosoro", "1111", 1878, "il signore degli anelli", "Fantasy"));
		archive.Add(new Riviste("NSKDN", "Quotidiano", "1999", 3 ,Periodicita.Settimanale));
//----------------------------
		//remove
		archive.Remove("NSKDN");
		//-------------------
		
		//Search 
		archive.Search("10"); //for isbn
		archive.SearchDate("1111"); //for date
		//----------
		
		
	}

}
