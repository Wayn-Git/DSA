public class RemoveElement{
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,4,5,3,3};
        int size = arr.length;
        int target = 3;

        int k = 0; 

        for(int i = 0; i < size; i++){
            if(arr[i] != target){
                arr[k] = arr[i];
                k++;
            }
        }

for(int i = 0;i < k; i++){
    System.out.println("Arr: " + arr[i]);
}

        System.out.println("Values: " + k);
    }
}