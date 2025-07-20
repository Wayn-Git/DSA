
import java.util.Scanner;

public class BubbleSortTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of your Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        System.out.println("The Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
}
