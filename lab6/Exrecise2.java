package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exrecise2 {
	public static void main(String[] args)
	{
		Exrecise2 exe2 = new Exrecise2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of character array: ");
		int size = scan.nextInt();		
		char[] array = new char[size];
		for(int i=0;i<size;i++) array[i]=scan.next().charAt(0);
		for(char c: array)
		{
			System.out.println(c);
		}
		Map<Character, Integer> mp = exe2.countChars(array);
		System.out.println(mp);
		
	}
	Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> map = new HashMap<>();
		Character ch;
		int val;
		for(int i=0;i<arr.length;i++) {
			ch=arr[i];
			if(map.containsKey(ch))
			{
				val=map.get(ch);
				map.put(ch,val+1);
			}
			else map.put(ch,1);
		}
		return map;
	}
}
