package Programs;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int arr[]= {3,2,5,4,6,1};
		System.out.println(Arrays.binarySearch(arr, 5));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		for(int temp:arr) {
//			System.out.println(temp);
//		}
		
		
	}
}
