package Array;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {5,4,3,7,2,9,1,0};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int e:arr) {
			System.out.println(e);
		}
	}
}
