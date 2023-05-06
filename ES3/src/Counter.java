
public class Counter {
int counter;

public Counter (int counter) {
	this.counter=counter;
	for (int i=0; i<counter; i++) {
		System.out.println(i+1);
	}
}
}

