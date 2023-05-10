package ES1;

public class ArrayThread {

	public static void main(String[] args) {
		classe t1 = new classe("*");
		classe t2 = new classe("#");
		t1.start();
		t2.start();
	}

}
