
public class ShowMethod {
	public ShowMethod( String titolo ,int luminosita) {
		String ash = new String(new char[luminosita]).replace('\0', '*');
		for (int c=0; c<luminosita;c++) {
			System.out.println(titolo+ash);
		}
	}
}
