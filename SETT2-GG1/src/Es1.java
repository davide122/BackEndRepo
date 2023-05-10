import java.util.Scanner;

public class Es1 {
	int[] array;
	 static Scanner sc = new Scanner(System.in);
	 
public Es1(){

	this.array=new int[5];
	System.out.println("ciao ei");
	int min = 0;
	int max = 10;

	this.array= new int[5];
	
	for(int i = 0; i<array.length;i++) {
		array[i]=(int)(Math.random() * (max - min + 1)) + min;
		System.out.println(array[i]+" "+"di indice"+" "+i);
	}
	legginumeropos(array);


	 	
}
public static void legginumeropos(int array[]) {
	int numero, posizione;
	 boolean stop = false;
	 do {
		 System.out.println("ciao, premi zero per uscire.");
		 int uscita = sc.nextInt();
		 if(uscita==0) {
			 stop=true;
		 }
		  try {
					for(int i = 0; i<array.length;i++) {
						System.out.println(array[i]);
					}
					 
					 
		  } 
		  catch(Exception e) {
			  System.out.print("hai inserito un imput che non accetto accetto solo numeri interi!");
		  }
		 
		
		
		
		
		 
	 }while(!stop);
}

}
