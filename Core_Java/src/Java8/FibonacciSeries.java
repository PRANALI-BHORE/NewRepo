package Java8;

import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		//fibonacci series
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(10).map(t->t[0]).forEach(i->System.out.println(i));
		//sum of fibonacci series
		int sum=Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(10).map(t->t[0]).mapToInt(Integer::intValue).sum();
		System.out.println("total: "+sum);
		//old way
		int n1=0,n2=1,n3,temp=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=9;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			temp=temp+n3;
			n1=n2;
			n2=n3;
		}
		System.out.println(temp+1);
	}
}
