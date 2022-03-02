package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
	public static void main(String[] args) {
		Exercise3 exe = new Exercise3();
		int[] array = new int[] {51,21,48,74,12,120};
		Map<Integer,Integer> map = exe.getSquares(array);
		System.out.println(map);
	}
	Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) map.put(arr[i], arr[i]*arr[i]);
		return map;
	}
}
