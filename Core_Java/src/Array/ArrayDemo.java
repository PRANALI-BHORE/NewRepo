package Array;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String a1[]= {"a", "b"};
		String a2[]= {"a", "a"};
		String a3[]= {"a"};
		
		int i1 = Arrays.mismatch(a1, a2);
		int i2 = Arrays.mismatch(a2, a3);
		int i3 = Arrays.mismatch(a3, a1);
		
		System.out.println(i1+""+i2+""+i3);
		
		int[]  rollNumber = { 23, 17, 20, 29, 30 };
	    Arrays.sort(rollNumber);
	    for (int temp : rollNumber)
	        System.out.print(temp+" ");
	    
	}
}
