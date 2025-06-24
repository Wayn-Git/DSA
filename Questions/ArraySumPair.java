
import java.util.Arrays;

public class ArraySumPair {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 5, 6};
        int target = 6;

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array Not Sorted..");
                System.out.println("Sorting Array...");

            }

        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Addition of: " + arr[left] + " " + arr[right] + " " + "Target: " + (arr[left] + arr[right]));
                found = true;
                break;
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
