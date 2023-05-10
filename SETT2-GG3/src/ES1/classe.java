package ES1;

public class classe extends Thread {
	

public String hash;

public classe(String message) {
	this.hash = message;
}

	public void run() {
		try {
			
				for(int i = 0; i<10;i++) {
					Thread.sleep(100);
			System.out.print(hash);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
