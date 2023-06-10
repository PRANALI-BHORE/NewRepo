package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,4,3,7,5,1,2,5);
		Set<Integer> set=new HashSet<Integer>();
		l.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
	}
}
