package Array;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
//		String s[]={"1","6","2","9","10"};
//		Arrays.sort(s);
//		System.out.println(Arrays.toString(s));
		
		int arr[]= {1,7,4,3,6,6,9,3};
		
		Arrays.sort(arr);
		int j,temp=0, length=arr.length;
		System.out.println("length: "+length);
		
		for(j=0;j<length-1;j++) {
			if(arr[j]!=arr[j+1]) {
				arr[temp++]=arr[j];
			}
		}
		
		
		System.out.println(arr[j]);
		
		for(int i:arr) {
			System.out.print(i+" ");
		
		}
		System.out.println("\nsecond highest: "+arr[length-2]);
		
	}
}
