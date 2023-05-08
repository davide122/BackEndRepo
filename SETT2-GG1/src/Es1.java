import java.util.Scanner;

public class Es1 {
	int[] array;
public Es1(){
	

	this.array=new int[5];
	System.out.println("ciao ei");
	int min = 0;
	int max = 10;

	this.array= new int[5];
	for(int i = 0; i<max;i++) {
		array[0]=(int)(Math.random() * (max - min + 1)) + min;
		array[1]=(int)(Math.random() * (max - min + 1)) + min;
		array[2]=(int)(Math.random() * (max - min + 1)) + min;
		array[3]=(int)(Math.random() * (max - min + 1)) + min;
		array[4]=(int)(Math.random() * (max - min + 1)) + min;
	}
	for(int i = 0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	 
	 boolean stop = false;
	 do {
		  try {
			  Scanner sc = new Scanner(System.in);
				 System.out.println("ciao, cambia il valore dell'array 0");
				 int valore1 = sc.nextInt();
				 array[0]=valore1;
					for(int i = 0; i<array.length;i++) {
						System.out.println(array[i]);
					}
					 
					 if(valore1==0) {
						 stop=true;
					 }
		  } 
		  catch(Exception e) {
			  System.out.print("hai inserito un imput che non accetto accetto solo numeri interi!");
		  }
		 
		
		
		
		
		 
	 }while(!stop);
	 	
}


}
