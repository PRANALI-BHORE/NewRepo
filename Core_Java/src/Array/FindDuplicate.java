package Array;

public class FindDuplicate {
	public static void main(String[] args) {
		int arr[]= {8,2,5,7,4,2,3,1,7,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				
				}
			}
		}
	}
}
