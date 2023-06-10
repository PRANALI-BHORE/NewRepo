package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortNumbers {
	public static void main(String[] args) {
		int arr[]= {5,3,8,1,4,2,1};
		List<Integer> l=new ArrayList<>();
		l=Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		System.out.println(l);
		//method 1
//		Arrays.sort(arr);
//		List<Integer> l=new ArrayList();
//		for(int i=0;i<arr.length;i++) {
//			l.add(arr[i]);
//		}
		//method 2
//		Arrays.sort(arr);
//		List<int[]> l=Arrays.asList(arr);
//		System.out.println(Arrays.toString(l.get(0)));
//		using java8
//		List<Integer> l=new ArrayList();
//		l=Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
//		System.out.println(l);
//		List<Integer> l1=Arrays.asList(1,7,4,5,3,9,3,2,4,5,7);
//		Set<Integer> s=new HashSet();
//		l1.stream().filter(i->s.add(i)).sorted().collect(Collectors.toSet()).forEach(i->System.out.println(i));//sorted and removed duplicates
	}
}
