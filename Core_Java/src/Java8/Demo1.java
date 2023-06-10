package Java8;

import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;

public class Demo1 {
	
	
	public static void main(String[] args) {
//		String x="10";
//		Integer y=10;
//		Long z=10L;
//		
//		System.out.println(x.equals(y));
////		System.out.println(x==y);
//		System.out.println(x.equals(z));
//		System.out.println(y.equals(z));
		
//		String s="pranali vilas bhore";
//		String s1[]=s.split(" ");
//		String word=s1[2];
//		System.out.println(word.length());
		
//		for(int i=1;i<=5;i++)
//        {
//            for(int j=5;j>0;j--)
//            {
//                if(i>=j)
//                {
//                    System.out.print(i);
//                }
//                else
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
		
		String s="asessment";
		HashSet<Character> set=new HashSet();
		HashSet<Character> set2=new HashSet();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(set.contains(c)) {
				set2.add(c);
			}
			else {
				set.add(c);
			}
		}
		System.out.println(set);
		
//		Optional e=s.chars().filter(x->!set.add(x)).findFirst();
		
	}
}
