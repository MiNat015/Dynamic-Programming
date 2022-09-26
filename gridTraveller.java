import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gridTraveller {

    private Map<String, Integer> memo = new HashMap<>();

    public int traveller(int m, int n){

        String ms = String.valueOf(m);
        String ns = String.valueOf(n);
        String key = ms + ","+ ns;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        // Base Cases
        if(m == 1 && n == 1){
            return 1;
        }

        if(m == 0 || n == 0){
            return 0;
        }

        int result =  traveller(m-1, n) + traveller(m, n-1);
        memo.put(key, result);

        return memo.get(key);
    }   

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of columns: ");
        int m = input.nextInt();
        System.out.print("Enter the no. of rows: ");
        int n = input.nextInt();
        input.close();

        gridTraveller traveller = new gridTraveller();
        System.out.println(traveller.traveller(m, n));

    }
}
