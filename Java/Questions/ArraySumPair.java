
import java.util.Arrays;

public class ArraySumPair {

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,9,8,2,3,4,5,2,6,2,8,7,6,5,4,7,9,8,6};
        int target = 7;

        int size = arr.length;

        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array Not Sorted..");
                System.out.println("Sorting Array...");
                isSorted = false;
                break;
            }

        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (isSorted == false) {
            Arrays.sort(arr);
        }

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        int count = 0; 

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                System.out.println("Addition of: " + arr[left] + " " + arr[right] + " " + "Target: " + (arr[left] + arr[right]) +" " +  " No Of Pairs: " + count);
                found = true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("Target Not Found");
        }
    }
}
