package ES2;

public class ES2 extends Thread {
	int min;
	int max;
static  int[] array1 = new int[3000];

public ES2(int min, int max) {
	this.min=min;
	this.max=max;
	
	
}
	
public void run() {
	
	for(int i = 0; i<(min+max);i++) {
		array1[i]=(int) (Math.random()*100);
		System.out.println(array1[i]);
	}
}



}
