import java.util.HashSet;

public class DuplicateCheck{


public static boolean DupCheck(int[] nums){
    HashSet<Integer> seen = new HashSet<>();
    for(int num : nums){
        if(seen.contains(num)){
            return true; 
        }
        seen.add(num);
    }
    return false;
}

    public static void main(String[] args){
     int [] nums = {2,3,2,3,3,3};
     boolean result = DupCheck(nums);
  System.out.println("result: " + result);

    }
}