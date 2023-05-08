import java.util.Scanner;

public class PLAYMETHOD {
	public PLAYMETHOD(int durata, String titolo, int volume, int luminosita) {
		//TITOLO PIù SEGUENZA DI PUNTI ESCLAMATIVi
		String exclamationPoints = new String(new char[volume]).replace('\0', '!');
		for (int i=0; i<durata;i++) {
			System.out.println(titolo+exclamationPoints);
		}
		//STAMPA PER RIGA **
		for (int e=0; e<luminosita;e++) {
			System.out.println("*");
		}
		Alzaluminosita(luminosita);
		Abbassaluminosita( luminosita);
	}
	static public void Alzaluminosita(int luminosita) {
		if (luminosita>=100) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ciao, sembra che la luminosità sia troppo alta puoi provare ad abbassarla!");
			luminosita = sc.nextInt();
			System.out.print("adesso la tua luminosità è di "+ luminosita);
		}
	}
	static public void Abbassaluminosita(int luminosita) {
		if (luminosita<=100) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ciao, sembra che la luminosità sia troppo bassa puoi provare ad alzarla!");
			luminosita = sc.nextInt();
			System.out.print("adesso la tua luminosità è di "+ luminosita);
		}
	}
	}

	

