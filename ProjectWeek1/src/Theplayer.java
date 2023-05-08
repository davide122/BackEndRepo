<<<<<<< HEAD
import java.util.Scanner;

public class Theplayer {
private boolean parola2;
public boolean isParola2() {
	return parola2;
}

public void setParola2(boolean parola2) {
	this.parola2 = parola2;
}

private int durata;
public int getDurata() {
	return durata;
}

public void setDurata(int durata) {
	this.durata = durata;
}
 private int volume;

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}
 
 private int luminosita;

public int getLuminosita() {
	return luminosita;
}

public void setLuminosita(int luminosita) {
	this.luminosita = luminosita;
}

 private boolean video;
 public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}


 private String titolo;
 public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}








public Theplayer(boolean parola2, int durata, int volume, String titolo,int luminosita,boolean video){
	this.setParola2(parola2);
	this.setDurata(durata);
	this.setVolume(volume);
	this.setTitolo(titolo);
	this.setLuminosita(luminosita);
	this.setVideo(video);
	//SMISTO I METODI IN BASE ALLA SCELTA DELL'UTENTE
	Scanner sc = new Scanner(System.in);
	System.out.print("Ciao, è riproducibile? rispondi con true o false");
	parola2 = sc.nextBoolean();
	System.out.print("un titolo?");
	 titolo = sc.next();
	
			
	if(parola2==true) {
		//video
		System.out.print("è un video? rispondi con true o false");
		video = sc.nextBoolean();
		if(video==true) {
			System.out.print("Quanto dura?");
		durata = sc.nextInt();
		System.out.print("scegli un volume da 0 a 10 per riprodurre il tuo video");
		volume = sc.nextInt();
		System.out.print("inserisci la luminosità in da 0 a 100");
		luminosita = sc.nextInt();
		System.out.print("faccio partire il tuo video");
		PLAYMETHOD b = new PLAYMETHOD(durata,titolo,volume,luminosita);
		
		}else{
			//registrazione
			System.out.print("Quanto dura?");
			durata = sc.nextInt();
			System.out.print("scegli un volume da 0 a 10 per riprodurre il tuo audio");
			volume = sc.nextInt();
			System.out.print("faccio partire la registrazione");
			AudioMethod s = new AudioMethod(durata,titolo,volume);
		}
		
		
		
	
	}else {
		//immagine
		System.out.print("inserisci la luminosità in da 0 a 100");
		luminosita = sc.nextInt();
		ShowMethod s = new ShowMethod (titolo,luminosita);

	}
	
	
		
	
	
	
}







}

=======
import java.util.Scanner;

public class Theplayer {
private boolean parola2;
public boolean isParola2() {
	return parola2;
}

public void setParola2(boolean parola2) {
	this.parola2 = parola2;
}

private int durata;
public int getDurata() {
	return durata;
}

public void setDurata(int durata) {
	this.durata = durata;
}
 private int volume;

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}
 
 private int luminosita;

public int getLuminosita() {
	return luminosita;
}

public void setLuminosita(int luminosita) {
	this.luminosita = luminosita;
}

 private boolean video;
 public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}


 private String titolo;
 public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}








public Theplayer(boolean parola2, int durata, int volume, String titolo,int luminosita,boolean video){
	this.setParola2(parola2);
	this.setDurata(durata);
	this.setVolume(volume);
	this.setTitolo(titolo);
	this.setLuminosita(luminosita);
	this.setVideo(video);
	//SMISTO I METODI IN BASE ALLA SCELTA DELL'UTENTE
	Scanner sc = new Scanner(System.in);
	System.out.print("Ciao, è riproducibile? rispondi con true o false");
	parola2 = sc.nextBoolean();
	System.out.print("un titolo?");
	 titolo = sc.next();
	
			
	if(parola2==true) {
		//video
		System.out.print("è un video? rispondi con true o false");
		video = sc.nextBoolean();
		if(video==true) {
			System.out.print("Quanto dura?");
		durata = sc.nextInt();
		System.out.print("scegli un volume da 0 a 10 per riprodurre il tuo video");
		volume = sc.nextInt();
		System.out.print("inserisci la luminosità in da 0 a 100");
		luminosita = sc.nextInt();
		System.out.print("faccio partire il tuo video");
		PLAYMETHOD b = new PLAYMETHOD(durata,titolo,volume,luminosita);
		
		}else{
			//registrazione
			System.out.print("Quanto dura?");
			durata = sc.nextInt();
			System.out.print("scegli un volume da 0 a 10 per riprodurre il tuo audio");
			volume = sc.nextInt();
			System.out.print("faccio partire la registrazione");
			AudioMethod s = new AudioMethod(durata,titolo,volume);
		}
		
		
		
	
	}else {
		//immagine
		System.out.print("inserisci la luminosità in da 0 a 100");
		luminosita = sc.nextInt();
		ShowMethod s = new ShowMethod (titolo,luminosita);

	}
	
	
		
	
	
	
}







}

>>>>>>> 13acb9babe35e01ff33d4a0f7aa5dee0f64d043d
