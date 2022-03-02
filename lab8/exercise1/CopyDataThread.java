package exercise1;
public class CopyDataThread implements Runnable{	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			FileProgram rc = new FileProgram();
			System.out.println("running");
			rc.readCopy();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println();
			System.out.println("Completed!!");
		}
		
	}
	
}
