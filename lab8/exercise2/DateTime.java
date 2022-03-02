package exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				LocalDateTime myDateObj = (LocalDateTime.now());
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    String formattedDate = myDateObj.format(myFormatObj);
			    System.out.println(formattedDate);
				Thread.sleep(10000);				
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		DateTime dT = new DateTime();
		Thread t = new Thread(dT);
		t.start();		
		
	}
	
}
