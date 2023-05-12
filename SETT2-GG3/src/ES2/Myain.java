package ES2;

public class Myain {

	public static void main(String[] args) {
		ES2 t1 = new ES2(0, 1000);
		t1.start();
		ES2 t2 = new ES2(1000,1000 );
		t2.start();
		ES2 t3 = new ES2(2000, 1000);
		t3.start();
	}

}
