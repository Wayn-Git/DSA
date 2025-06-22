import java.util.Arrays; // Importing to sort the array
import java.util.Scanner; // IMporting to take user input

public class BinarySearch {
    public static void main(String[] arg) {
        try (Scanner sc = new Scanner(System.in)) { // try block to avoid the erorr
            System.out.println("Enter the Size Of Your Array: "); // We take the size of the array
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter elemnts of your array: "); // We take the elements of the array
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); // We sort the array so we can get the middle index (Which determines weather
                              // the loop will move to the right or the left ) if the mid is smaller than the
                              // target than it will move to the right (Towards the bigger elements)
                              // If the mid is larger than the target it will move towards the left (Towards
                              // the smaller elements)

            System.out.println("Enter A Target: "); // We get the target to comapre
            int target = sc.nextInt();

            int start = 0; // Initializing the starting index
            int end = arr.length - 1; // initializing the ending index

            while (start <= end) { // Checking weather it's sorted
                int mid = (start + end) / 2; // Mid value formula
                int midIndex = arr[mid]; // Getting the mid value of the array

                if (target == midIndex) {
                    System.out.println("ElementFound:" + midIndex); // This will check weather our new mid is the target
                                                                    // or not
                    break;
                }
                if (arr[mid] < target) { // The mid is less than the target so the mid will move towards the right (The
                                         // bigger Numbers )
                    start = mid + 1;
                }
                if (arr[mid] > target) { // Vise Versa of the top
                    end = mid - 1;
                }
            }

        }
    }
}
