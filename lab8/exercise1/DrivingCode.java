package exercise1;

public class DrivingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyDataThread cT = new CopyDataThread();
		Thread t = new Thread(cT);
		t.start();	
	}
	

}
