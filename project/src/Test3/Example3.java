package Test3;

public class Example3 {
	public static int findMissingNumber(int[] arr) {
	    int n = arr.length + 1;
	    int sum = n * (n + 1) / 2;
	    int arrSum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        arrSum += arr[i];
	    }
	    int missingNumber = sum - arrSum;
	    return missingNumber;
	}

}
