import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class howSum {

    // Memo to record existing returns
    private Map<Integer, List<Object>> memo = new HashMap<>();
    
    public List<Object> sum(int target, int[] numbers){
        
        // Memoization
        if(memo.containsKey(target)){
            return memo.get(target);
        }

        // Base Case
        if(target == 0){
            return Collections.emptyList();
        }

        if(target < 0){
            return null;
        }

        for(int i = 0; i < numbers.length; i++){
             int remainder = target - numbers[i];
             List<Object> remainderResult = sum(remainder, numbers);

             if(remainderResult != null){
                List<Object> newList = new ArrayList<Object>();
                newList.addAll(remainderResult);
                newList.add(numbers[i]);
                memo.put(target, newList);
                return newList;
             }
        }
        memo.put(target, null); 
        return null;
    }

    public static void main(String[] args){

        // Time and space complexity
        // m = target sum
        // n = numbers.length
        // 
        // Brute Force
        // Time: O(n^m * m)
        // Space: O(m)
        //
        // Memoized 
        // Time: O(n*m^2)
        // Space: O(m)


        howSum sum = new howSum();
        //Test Cases

        //Test Case: 1
        int[] num1 = {5, 3, 4, 7};
        System.out.println(sum.sum(7,num1));
        
        //Test Case: 2
        int[] num2 = {2, 4};
        System.out.println(sum.sum(7, num2));

        //Test Case: 3
        int[] num3 = {5, 3, 4, 9, 6};
        System.out.println(sum.sum(12, num3));

        //Test Case: 4
        int[] num4 = {7, 14};
        System.out.println(sum.sum(300, num4)); 
    }   
}
