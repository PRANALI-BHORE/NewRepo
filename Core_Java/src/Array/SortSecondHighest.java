package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortSecondHighest {
	public static void main(String[] args) {
		int arr[]= {7,2,5,4,6,1,3,4,10};
		TreeSet<Integer> set=new TreeSet<>();
//		Arrays.sort(arr);
		for(int i:arr) {
//			System.out.println(i);
			set.add(i);
		}
		System.out.println(set);
		int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(uniqueArray.length-1);
//		OptionalInt findFirst = Arrays.stream(arr).skip(1).findFirst();
//		System.out.println(findFirst);
	}
}
