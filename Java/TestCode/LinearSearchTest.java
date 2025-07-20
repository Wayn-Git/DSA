
import java.util.Scanner;

public class LinearSearchTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements Of Your Array: ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Your Target: ");
        int target = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Target Found, Index: " + i);
            }
        }

    }
}
