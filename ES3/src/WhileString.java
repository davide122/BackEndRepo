<<<<<<< HEAD
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
=======
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
>>>>>>> 13acb9babe35e01ff33d4a0f7aa5dee0f64d043d
