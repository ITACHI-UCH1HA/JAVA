package Dynamic_Programming;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(fib_dp(1000, new HashMap<>()));
    }
    public static long fib_dp(int num, Map<Integer,Long> memo){
        if(num<2){
            return 0;
        }
        if(num==2){
            return 1;
        }
        if(memo.containsKey(num)){
            return memo.get(num);
        }
        long result=fib_dp(num-1,memo)+fib_dp(num-2,memo)+fib_dp(num-3,memo);
        memo.put(num,result);
        return result;
    }
}
