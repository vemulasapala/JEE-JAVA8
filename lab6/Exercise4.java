package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise4 exe4 = new Exercise4();
		Integer marks;
		String Id;
		boolean start=true;
		Map<String,Integer> mp = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		while(start)
		{
			
			System.out.println("Enter the Marks of Student: ");
			marks = (Integer)scan.nextInt();
			System.out.println("Enter the Registration number of Student: ");
			Id = scan.next();
			mp.put(Id,marks);
			System.out.println("Do you want to add or not");
			start = scan.nextBoolean();			
		}
		Map<String,String> map = new HashMap<>();
		map = exe4.getStudents(mp);	
		System.out.println(map);
	}
	Map<String,String> getStudents(Map<String,Integer> m){
		Map<String,String> resultMap = new HashMap<>();
		ArrayList<String> al = new ArrayList<>(m.keySet());
		Integer marks=0;
		//System.out.println(al);
		for(int i=0;i<al.size();i++) {
			//System.out.print(al.get(i).getClass()+" ");
			marks = m.get(al.get(i));
			//System.out.println(marks.getClass());
			
			if(marks>=90) resultMap.put(al.get(i),"Gold");
			if(marks>=80 &&  marks<90) resultMap.put(al.get(i),"Silver");
			if(marks>=70 &&  marks<80) resultMap.put(al.get(i),"Bronze");	
				
		}
		return resultMap;
	}
}
