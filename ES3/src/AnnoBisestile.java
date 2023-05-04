
public class AnnoBisestile {
int anno;



public AnnoBisestile(int anno) {
	this.anno = anno;
	if (anno%400==0 || (anno%4==0 && anno%100!=0)) {
		   System.out.println("è Bisestile");
		} else {
		   System.out.println("Non è Bisestile");
		}
}

}

