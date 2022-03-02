package exercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {	
		// TODO Auto-generated method stub
		void readCopy() throws IOException {			
			FileReader fr = new FileReader("C:\\Users\\s\\Desktop\\source.txt"); 
			FileWriter fw = new FileWriter("C:\\Users\\s\\Desktop\\target.txt");
	        int i; 
	        int count=0;
	        while ((i = fr.read()) != -1) {
	        	// Print all the content of a file
	            System.out.print((char)i); 
	            fw.write((i));      
	            if(count==10) 
	            {
	            	System.out.println();
	            	System.out.println("10 characters are copied");
	            	count=0;	            	
	            }
	            count++;
	        }        
	        
	        fw.flush();
	        fw.close();
		}
		
}

            
    



