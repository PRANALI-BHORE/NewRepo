package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class secondHighestfromDuplicates {
	public static void main(String[] args) {
		int arr[]= {2,3,1,5,4,6,3,6};
		Arrays.sort(arr);
		Set<Integer> set=new HashSet<>();
		
		for(int temp:arr) {
			set.add(temp);
		}
		System.out.println(set);
		int arr2[]=new int[set.size()];
		int i=0;
		for(int temp2:set) {
			arr2[i++]=temp2;
		}
		Arrays.sort(arr2);
		int n=arr2.length; 
		System.out.println(arr2[n-2]);
	}
}
