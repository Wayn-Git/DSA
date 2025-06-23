import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: "); 
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of your Array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target: "); 
        int target = sc.nextInt();

        Arrays.sort(arr);

        int start = 0, end = size - 1; 
        int mid = (start + end) / 2;
        boolean found = false; 

        while(start <= end){
            if(arr[mid] == target){
                System.out.println("Target found: " + mid);
                found = true;
                break;
            } 
            else if(arr[mid] > target){
                arr[end] = mid - 1;
            } else if(arr[mid] < target){
                arr[start] = mid + 1;
            }
        }



    }
}