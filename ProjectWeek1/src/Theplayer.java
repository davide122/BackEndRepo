import java.util.Scanner;

public class Theplayer {
 


public Theplayer(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Ciao, è riproducibile? rispondi con true o false");
	boolean Parola2 = sc.nextBoolean();
	if(Parola2==true) {
		System.out.print("Quanto dura?");
		int durata = sc.nextInt();
		System.out.print("scegli un volume da 0 a 10 per riprodurre il tuo video/audio");
		int volume = sc.nextInt();
		System.out.print("faccio partire il tuo video/registrazione");
	}
	else {
		System.out.print("un titolo per quest'immagine?");
		String titolo = sc.next();
	}
	
		
	sc.close();
	
}

}

