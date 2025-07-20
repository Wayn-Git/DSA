public class Solution {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 6, 7, 3};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        // Reverse the array
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print the reversed array
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
