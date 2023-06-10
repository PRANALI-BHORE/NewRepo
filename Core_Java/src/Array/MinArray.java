package Array;

public class MinArray {
	public static void main(String[] args) {
		int arr[]= {4,6,3,2,1,8};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min element: "+min);
	}
}
