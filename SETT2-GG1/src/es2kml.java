import java.util.Scanner;

public class es2kml {
	
@SuppressWarnings("resource")
public es2kml(){
	try {
		boolean start = true;
		do {
			Scanner sc = new Scanner(System.in);
		System.out.println("quanto hai percorso in km/h?");
		double percorso = sc.nextDouble();
		System.out.println("quanto litri hai sprecato in "+percorso+"km"+"?");
		double litri = sc.nextDouble();
		System.out.println("la tua macchina spreca:"+(percorso/litri)+"km/l");
		start = false;
		if(percorso == 0 || litri == 0) {
		
			
		} 
		}while(!start);
		
	}catch(Exception e) {
		System.out.println("mi dispiace, non posso fare il calcolo se uno dei valori è 0!");
		
	}
	

	
}


}
