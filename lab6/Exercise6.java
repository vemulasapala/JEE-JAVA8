package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args)
	{
		Map<Integer,String> m = new HashMap();
		String dob;
		Integer id;
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		while(start)
		{
			dob=scan.next();
			id = scan.nextInt();
			m.put(id,dob);
			start=scan.nextBoolean();
		}
		//System.out.println(m);
		List<Integer> answer=votersList(m);
		System.out.println(answer);
		
	}
	static List votersList(Map<Integer,String> m) {
		List list = new ArrayList(m.keySet());	
		List result = new ArrayList();
		//System.out.println(m);
		//System.out.println(list);
		Integer in,year;
		String str;
		String[] s1 = new String[3];
		for(int i=0;i<m.size();i++)
		{
			in = (Integer)list.get(i);
			str = m.get(in);
			//System.out.println(in);
			//System.out.println(str);			
			s1=str.split("-");
			year = Integer.parseInt(s1[2]);
			if(2022-year>=18) 
			{
				result.add(in);				
			}
		}
		//System.out.println(result);
		return result;
	}
}
