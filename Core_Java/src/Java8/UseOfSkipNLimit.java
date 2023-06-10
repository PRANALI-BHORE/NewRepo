package Java8;

import java.util.Arrays;
import java.util.List;

public class UseOfSkipNLimit {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		System.out.println("limit():");
		list.stream().limit(5).forEach(x->System.out.println(x));
		System.out.println("skip():");
		list.stream().skip(5).forEach(x->System.out.println(x));
	}
}
