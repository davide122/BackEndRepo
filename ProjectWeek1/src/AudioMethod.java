import java.util.Scanner;

public class AudioMethod {
	public AudioMethod(int durata, String titolo, int volume) {
		for (int i=0; i<durata;i++) {
			System.out.println(titolo);
		}
		AbbassaVolume(volume);
		AlzaVolume(volume);
		//STAMPA PER RIGA **
		for (int e=0; e<volume;e++) {
			System.out.println("!");
		}
		
	}
	public void AbbassaVolume(int volume) {
		if (volume>=10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ciao, sembra che il volume è al massimo puoi provare ad abbassarlo!");
			volume = sc.nextInt();
		}
	}
	
	public void AlzaVolume(int volume) {
		if (volume<=0) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ciao, sembra che il volume è al minimo puoi provare ad alzarlo! scegli un volume da 0 a 10");
			volume = sc.nextInt();
		}
	}
}
