package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		System.out.println("this is my frist epicode java project! ");
		moltiplica(10,2);
		Concat(10,"ciao");
		//echo();
		//PerimetroRettangolo();
		//PariDispari();
		AreaTriangolo();
//		InserisciInArray(arr[], "toyota");
		}


	public static int moltiplica(int n1, int n2)
	{
		System.out.println(n1*n2);
	return (n1*n2);	 
	}

	public static String Concat(int n3, String ciao)
	{
		System.out.println(n3+ciao);
	return (n3+ciao);	 
	}




	public static void InserisciInArray(String arr[], String newcar)
	{
		arr[0]="xiap";
		arr[3]=newcar;
		arr[2]=newcar;
		arr[1]="fiat";
		return;
	}

	

	public static void echo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il nome:");
		String nome = sc.nextLine();
		System.out.print("Inserisci il cognome:");
		String cognome = sc.nextLine();
		System.out.print("Inserisci la tua residenza:");
		String residenza = sc.nextLine();
	
		sc.close();
		String response =( "sei"+" "+nome+" "+cognome+" "+"e sei residente in"+" "+residenza);
		System.out.println(response);
	
	}
	
	public static void PerimetroRettangolo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il primo lato in cm:");
		int Lato1 = sc.nextInt();
		System.out.print("Inserisci il secondo lato in cm:");
		int Lato2 = sc.nextInt();
		System.out.print("il tuo perimetro è di:" +(Lato1+Lato2)+"cm");
		sc.close();
	}
	
	public static boolean PariDispari()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il  numero");
		int Num1 = sc.nextInt();
		sc.close();
		if ((Num1%2)==0) {
			 System.out.print("il tuo numero è pari");

			return true;

			
			
		}else {
			 System.out.print("il tuo numero è dispari");
			return false;
		}
	
	}
	
	
	
	public static void AreaTriangolo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il primo lato in cm:");
		int Lato1 = sc.nextInt();
		System.out.print("Inserisci il secondo lato in cm:");
		int Lato2 = sc.nextInt();
		System.out.print("Inserisci il terzo lato in cm:");
		int Lato3 = sc.nextInt();
		System.out.print("il tuo perimetro è di:" +(Lato1+Lato2+Lato3)+" "+"servirà per calcolare l'area"+" ");
		
		int perimetro = Lato1+Lato2+Lato3;
		
		if ((Lato1==Lato2||Lato2==Lato3||Lato3==Lato2)) {
			System.out.println("MI dispiace, ma non posso calcolare un triangolo equilatero.");

		}else {
			int semiperimetro = perimetro/2;
		int Area = (semiperimetro*(semiperimetro-Lato1)*(semiperimetro-Lato2)*(semiperimetro-Lato3));
		System.out.println("ecco la tua area"+" "+(Area));
		}
		sc.close();

	}



}



