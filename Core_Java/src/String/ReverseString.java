package String;

import java.util.Scanner;

public class ReverseString {
	
		public static void isPalindromUsingReverseMethod(String s) {
//			String s="madam";
			s=s.toLowerCase();
			StringBuilder sb=new StringBuilder(s);
		    sb.reverse();
		    System.out.println("Reverse of string: "+sb);
			if(sb.toString().equals(s))
				System.out.println("Given string is palindrom");
			else System.out.println("Not palindrom");
		}

		
	    public static void isPalindromUsingForLoop(String s) {
//	    	String s="pran";
	    	s=s.toLowerCase();
	    	int l=s.length();
			String reverse="";
			for(int i=l-1;i>=0;i--) {
				reverse=reverse+s.charAt(i);
			}
			System.out.println("Reverse of string: "+reverse);
			if(reverse.equals(s)) {
				System.out.println("is palindrom");
			}
			else System.out.println("not palindrom");
	    }
		
		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			System.out.print("Enter the string: ");
			String s=s1.next();
//			isPalindromUsingReverseMethod(s);
			
			isPalindromUsingForLoop(s);
	}
}
