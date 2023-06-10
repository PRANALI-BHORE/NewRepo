package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occuranceOfString {
	public static void main(String[] args) {
		String s="hello hi pranali hi amol hello";
		List<String> l=Arrays.asList(s.split(" "));
//		System.out.println(l);
		Map<String, Long> m=l.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(m);
		
	}
}
