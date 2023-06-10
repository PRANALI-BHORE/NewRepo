package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {
	public static void main(String[] args) {
		String s = "i i am am am pranali from pune pune";
		List<String> list = Arrays.asList(s.split(" "));
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	
		System.out.println(map);
		
//		byte a=10;
//		byte b=20;
//		byte c=a+b;
//		System.out.println(c);
		
		int a = 0;
		a+=1;
		a=2;
		System.out.println(a);
		
		
		
	}
}
