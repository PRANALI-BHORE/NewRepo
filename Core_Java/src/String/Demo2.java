package String;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		String s="pranali bhore";
		String s1=s.substring(8);
		System.out.println(s1);   //bhore
		StringBuffer sb=new StringBuffer(s1);
//		sb.reverse().toString();
		System.out.println(s.substring(0,7)+" "+sb.reverse().toString());
		
		final int i=10;
		int j=i+20;
//		i=j+30;
		System.out.println(i+" "+j);
		
		
		String str1 = new String("Arun");
		String str2 = new String("Arun");

		Set<String> set = new HashSet();
		set.add(str1);
		set.add(str2);
		System.out.println(set.size());
		
		
	}
}
