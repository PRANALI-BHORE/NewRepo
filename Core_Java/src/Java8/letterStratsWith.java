package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class letterStratsWith {
	public static void main(String[] args) {
		List<String> l=List.of("apple","orange","banana","apple");
		List<String> l2=l.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
		System.out.println(l2);
	}
}
