import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size Of Your Array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter elemnts of your array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter A Target: ");
            int target = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (arr[i] == target) {
                    System.out.println("Index: " + i + " Element: " + arr[i]);
                }
            }

        }

    }
}