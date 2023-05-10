package ES2;

public class class2 extends Thread{

	int[] array=new int[3000];
	
	
	public void run() {
		for(int i=0;i<3000;i++) {
		this.array[i]= (int) (Math.random()*100);
		System.out.println(array[i]);
		
		}
	}
	
	
	
}