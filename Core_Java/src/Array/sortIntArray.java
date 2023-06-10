package Array;

import java.util.Arrays;

public class sortIntArray {
	public static void main(String[] args) {
		int arr[]= {6,2,7,5,4};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		Arrays.stream(arr).forEach(num->System.out.print(num + " "));
	}
}
