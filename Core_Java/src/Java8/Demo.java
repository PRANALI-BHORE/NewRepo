package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		String s="hi i am am hi pranali";
		List<String> list=Arrays.asList(s.split(" "));
		Map<String, Long> map=new HashMap<>();
		map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
//		Multiplication m=(a,b)->System.out.println(a*b);
//		m.multiply(2, 3);
	}
}

@FunctionalInterface
interface Multiplication{
	void multiply(int a,int b);
}