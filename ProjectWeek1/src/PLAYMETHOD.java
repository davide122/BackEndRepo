
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
	}
	}

	

