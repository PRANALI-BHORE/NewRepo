package Array;

import java.util.Arrays;

public class FindAnagram {
	public static void main(String[] args) {
		String s1="Grab";
		String s2="Brag";
		System.out.println("String s1: "+s1);
		System.out.println("String s2: "+s2);
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
//		System.out.println("converted to lower case..");
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
//		System.out.println("converted to character array..");
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)==true
				) {
			System.out.println("Strings are anagram...");
		}
		else {
			System.out.println("Strings are not anagram...");
		}
	}
}
