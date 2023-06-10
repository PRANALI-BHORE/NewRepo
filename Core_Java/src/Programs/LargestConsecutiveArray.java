package Programs;

import java.util.Arrays;

public class LargestConsecutiveArray {

public static void main(String[] args) {
	
int arr[]={1,2,3,11,12,4,5,6,7};
int start = 0;
int end = 0;
int currentStart = 0;

for (int i = 1; i < arr.length; i++) {
    if (arr[i] - arr[i - 1] == 1) {
        if (i == arr.length - 1 && (i - currentStart) > (end - start)) {
            start = currentStart;
            end = i;
        }
    } else {
        if ((i - 1 - currentStart) > (end - start)) {
            start = currentStart;
            end = i-1;
        }
        currentStart = i;
    }
}

int[] largestConsecutiveSubArray = Arrays.copyOfRange(arr, start, end + 1);
System.out.println("Largest consecutive sub-array: " + Arrays.toString(largestConsecutiveSubArray));

}
}