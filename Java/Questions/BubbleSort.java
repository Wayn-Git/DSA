
//Bubble Sort Algorithem

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 3 }; //Initializing an Array 
        int size = arr.length; //Storing the size of the array for future reference

        int i, j, temp; // Initializing important varibles

        for (i = 0; i < size - 1; i++) { //Runs the inner loops multiple times to ensure that all elemnts are sorted (i increasses as the j completes whole round) this makes sures to leave the last element in the array because it's already sorted 
            for (j = 0; j < size - i - 1; j++) {  // As j increases, i increases leaving more and more elemnts, phase 1: no elements eveyrthing paired uip and checked and largest element moved to the end, second phase last elememnt is left out and sorted again, third phase last two elemtns are left out because they are sorted and it goes on until it hits 0
                if (arr[j] > arr[j + 1]) {  // Comparision and Swap Logic 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        for (i = 0; i < size; i++) {
            System.out.println("Sorted Array: " + arr[i]); // Displaying the sorted array 
        }

    }
}