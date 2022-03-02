package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.List;
public class Exercise1 {
	public static void main(String[] args) {
		Exercise1 exe1 = new Exercise1();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(3, "Chief");
		hm.put(2,"Executive");
		hm.put(1,"Officer");
		System.out.println("Before sorting: "+hm.values());
		List str = new ArrayList(exe1.getValues(hm));		
		System.out.println(str);
	}
	List getValues(HashMap<Integer,String> h)
	{	
		List str = new ArrayList(h.values());
		Collections.sort(str);
		return str;		
	}
}
