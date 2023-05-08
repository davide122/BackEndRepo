import java.util.Scanner;

public class ShowMethod {
	public ShowMethod( String titolo ,int luminosita) {
		String ash = new String(new char[luminosita]).replace('\0', '*');
		for (int c=0; c<luminosita;c++) {
			System.out.println(titolo+ash);
		}
		Alzaluminosita(luminosita);
		Abbassaluminosita(luminosita);
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
			System.out.print("Ciao, sembra che la luminosità sia troppo bassa puoi provare ad abbassarla!");
			luminosita = sc.nextInt();
			System.out.print("adesso la tua luminosità è di "+ luminosita);
		}
	}
	
}
