import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the size of your array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target element to search: ");
            int target = sc.nextInt();

            int mid = (arr.length + (arr[arr.length-1]))/2;

            // Linear search logic
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (arr[mid] == target) {
                    System.out.println("Target found at index " + i);
                    found = true;
                    break;
                } else if(arr[mid] < target){
                    arr[i] = arr[mid + 1];
                }else if(arr[mid] > target){
                    arr[i] = arr[mid - 1];
                }
            }

            if (!found) {
                System.out.println("Target not found in the array.");
            }
        }
    }
}
