package Dynamic_Programming;

import java.util.HashMap;
import java.util.Map;

public class Fibbonaci {
    public static void main(String[] args) {
        System.out.println(fib1(3));
    }
    public static int fib1(int num){
        if(num<2){
            return num;
        }
        return fib1(num-1)+fib1(num-2);
    }
    public static long fib_dp(int num, Map<Integer,Long> memo){
        if(num<2){
            return num;
        }
        if(memo.containsKey(num)){
            return memo.get(num);
        }
        long result=fib_dp(num-1,memo)+fib_dp(num-2,memo);
        memo.put(num,result);
        return result;
    }
}
