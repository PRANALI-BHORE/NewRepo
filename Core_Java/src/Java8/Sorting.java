package Java8;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,4,2,7,2,9,1,6,3);
//		List<Integer> list2=list.stream().sorted().collect(Collectors.toList()); //sorted order
//		System.out.println(list2);
//		Set<Integer> set=list.stream().sorted().collect(Collectors.toSet());	//sorted and duplicates removed
//		System.out.println(set);
//		Set<Integer> list3=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toSet());
//		System.out.println(list3);
//		list3.forEach(e->System.out.println(e));
	}
}
