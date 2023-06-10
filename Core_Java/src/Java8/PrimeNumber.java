package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		boolean i=IntStream.range(2, n).noneMatch(x->n%x==0);
		  System.out.println(i);
		  

//				int num=5, temp=0;
//				for(int i=2;i<num;i++){
//					if(num%i==0){
//						temp=temp+1;
//					}
//				}
//				if(temp>0){
//					System.out.println("is prime");
//				}
//				else if(temp==0){
//					System.out.println("not prime");
//				}
//
//			}
	
}
}
