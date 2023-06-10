package Programs;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		boolean i=false;
		int temp=0;
		for(int i1=2;i1<n;i1++) {
			if(n%i1==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("number not prime");
		}
		else
			System.out.println("is prime");
		
//		  boolean i=IntStream.range(2, n).noneMatch(x->n%x==0); //java 8
//		  System.out.println(i);
		
	}
}
