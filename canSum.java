import java.util.Map;
import java.util.HashMap;

public class canSum{

    //Memoisation
    private Map<Integer, Boolean> memo = new HashMap<>();

    public boolean sum(int target, int[] numbers){

        if(memo.containsKey(target)){
            return memo.get(target);
        }

        if(target == 0){
            return true;
        }

        if(target < 0){
            return false;
        }

        for(int i=0; i<numbers.length;i++){
           int remainder = target - numbers[i];

           if(sum(remainder, numbers) == true){
                memo.put(target, true);
                return true;
           }
        }
        memo.put(target, false);
        return false;
    }

    public static void main(String[] args){
        canSum sum = new canSum();

        // Test Case: 1
        int[] numbers = {7, 14};
        System.out.print(sum.sum(300, numbers));
    }
}
