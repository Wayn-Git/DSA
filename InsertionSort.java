public class InsertionSort{
    public static void main(String[] args){
         
         int[] arr = {3,5,2,5,2,5,2,4,8,6,32,4,7,2,};
         int size = arr.length;

         for(int i = 1; i < size; i++){
            int temp = i;
            int j = temp - 1; 

while(j > temp && arr[j] > temp){
    arr[j] = arr[j+1];
    j--;
}

arr[j+1] = temp;
         }

         for(int i:arr){
            System.out.println(i);
         }

          
    }
}