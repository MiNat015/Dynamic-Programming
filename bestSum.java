import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bestSum {

    // Creating memo for memoization
    private Map<Integer, List<Object>> memo = new HashMap<>();

    public List<Object> bSum(int target, int[] numbers){

        // Memoization
        if(memo.containsKey(target)){
            return memo.get(target);
        }

        // Base case
        if(target == 0){
            return Collections.emptyList();
        }

        if(target < 0){
            return null;
        }

        List<Object> shortestCombination = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            int remainder = target - numbers[i];
            List<Object> remainderCombination = bSum(remainder, numbers);

            if(remainderCombination != null){
                List<Object> combination = new ArrayList<>();
                combination.addAll(remainderCombination);
                combination.add(numbers[i]);

                // If combination is shorter than the current 
                // shortestCombination then update it

                if(shortestCombination .size() == 0 || combination.size() <= shortestCombination.size()){
                    shortestCombination = combination; 
                }
        
            }

        }

        memo.put(target, shortestCombination);
        return shortestCombination;
    }

    public static void main(String[] arg){

        // Time and Space Complexity
        //
        // Brute Force:
        // Time: O(n^m * m)
        // Space: O(m^2)
        //
        // Memoized version:
        // Time: O(n * m^2)
        // Space: O(m^2)

        bestSum sum = new bestSum();
        
        // Test Case: 1
        int[] num1 = {2,3,5};
        System.out.println("Test Case 1: " + sum.bSum(8, num1));

        // Test Case: 2
        int[] num2 = {5, 3, 4, 7};
        System.out.println("Test Case 2: " + sum.bSum(7, num2));

        // Test Case: 3
        int[] num3 = {1, 4, 5};
        System.out.println("Test Case 3: " + sum.bSum(8, num3));

        // Test Case: 4
        int[] num4 = {1, 2, 5, 25};
        System.out.println("Test Case 4: " + sum.bSum(100, num4));
    }
}
 