package Array;

public class MaxArray {
	public static void main(String[] args) {
		int arr[]= {2,8,7,6,9,1,0};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max element: "+max);
	}
}
