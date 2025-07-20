import java.util.HashSet; // Importing HashSet

public class ContainsDuplicate{ 

    public static boolean ContainsDuplicate(int[] nums){ // A function to pass a list of integers to check weahter it has duplicates

        HashSet<Integer> haveSeen = new HashSet<>(); // Initializing HashSet

        for(int num : nums){  /* Enchanted for loop it's like it iterates through every element of the given list

                                           (It does not work if there has been operations performed on the array) */

            if(haveSeen.contains(num)){   // Checking weather the "num" is present in the HashSet 

                return true;             // If there is an duplicate we return true
            }
            haveSeen.add(num);   /* We add the integer if the hashset doesn't already have it 

                                (We start wiith it being empty in the secon diteration it checks weather its there if it is,

                                 it returns true) */
        }
        return false;    /* If it doesn't have any it just simpyl returns false like we iterate through every element

                            ex:"[2,3,2,2,]" we see that there are 3 2s so it does have duplicate. 

                            The 0 iteration it added two,

                            the second iteration it checked weather the hashset has 3 and it adds 3,

                            in the third iteration it checks weather there is 2 

                            in the hashset OH there is indeed 2 in the 

                            hashset so it just simply returns true */
    }
    public static void main(String[] args) {
       int[] list = {3,5,23,2};
       boolean result = ContainsDuplicate(list);
       System.out.println("Result: " + result);
    }
}