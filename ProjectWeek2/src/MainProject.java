
public class MainProject {

	public static void main(String[] args) {
//Riviste  : String iSBN, String titolo, String annoPubblicazione, int numeroPagine, Periodicita periodicita
//LIBRI  : String iSBN, String titolo, String annoPubblicazione, int numeroPagine,String autore, String genere
		Archive archive = new Archive();
		//add
		archive.Add(new Libri("10","il mio teosoro", "1111", 1878, "il signore degli anelli", "Fantasy"));
		archive.Add(new Riviste("NSKDN", "Quotidiano", "1999", 3 ,Periodicita.Settimanale));
		archive.Add(new Libri("1230","non lo so ", "11121", 18278, "il signore degli animali", "Fantasy"));
		archive.Add(new Riviste("NSKDN", "giornale", "11999", 3 ,Periodicita.Mensile));
//----------------------------
		//remove
	//archive.Remove("10");  //for isbn
	//archive.Remove("NSKDN");
		//-------------------
		
		//Search 
		archive.Search("10"); //for isbn
		archive.SearchDate("1111"); //for date
		archive.SearchAuthor("il signore degli anelli");
		//----------
		
		
	}

}
