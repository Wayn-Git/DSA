import java.util.Scanner; //Importing Scanner to get the user input 

public class LinearSearch {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size Of Your Array: ");  // Getting the size of the Array
            int size = sc.nextInt();

            int[] arr = new int[size]; // Storing the size of the array 

            System.out.println("Enter elemnts of your array: ");  //Getting the elements of the array 
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter A Target: ");  //Getting the target element
            int target = sc.nextInt();

            for (int i = 0; i < size; i++) {   // The loop iterates over each element of the array 
                if (arr[i] == target) {   // The if statement checks weather the eleemnt of the array is = to the target 
                    System.out.println("Index: " + i + " Element: " + arr[i]); // if true we return the index and the element
                }
            }

        }

    }
}