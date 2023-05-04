import java.util.Scanner;

public class WhileString {
String Parola;

public WhileString(String Parola) {
	this.Parola=Parola;
	while(Parola!=":q") {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la tua stringa");
		String Parola2 = sc.nextLine();
		String[] parolad = Parola.split("\\s*,\\s*");
		System.out.println(parolad);
		sc.close();
	}
}
}
