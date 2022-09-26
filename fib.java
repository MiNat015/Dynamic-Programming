import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


class Test{

    //Memoization
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n){

        // Fibonacci sequence using memoization and recursion
        // Takes O(n) time
        // Takes O(n) space
        
        if(this.memo.containsKey(n)){
            return this.memo.get(n);
        }

        // Base case
        if(n <= 2){
            return 1;
        }

        int result =  fib(n-1) + fib(n-2);
        this.memo.put(n, result);
        
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        Test fib = new Test();
    
        System.out.println(fib.fib(n));


    }
}