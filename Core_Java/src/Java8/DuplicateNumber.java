package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateNumber {
	public static void main(String[] args) {
		//method 1
//		List<Integer> list= Arrays.asList(1,2,6,4,8,2,9,5,1,5);
//		Set<Integer> set=new HashSet<>(list);
//		System.out.println(set);
//		List<Integer> l1=new ArrayList<>(set);
//		System.out.println(l1);
		Integer arr[]= {1,2,6,4,8,2,9,5,1,5};
		
		List<Integer> list= Arrays.asList(arr);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(x->set.add(x)).collect(Collectors.toList()).forEach(x->System.out.println(x)); //remove duplicates
//		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x)); // print only duplicates
		
	}
}
	
