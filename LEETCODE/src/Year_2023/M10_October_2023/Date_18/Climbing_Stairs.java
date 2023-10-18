package Year_2023.M10_October_2023.Date_18;

import java.util.HashMap;
import java.util.List;

public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2,new HashMap<>()));
    }
    private static int climbStairs_recurssion(int n) {
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }
        return climbStairs_recurssion(n-1)+climbStairs_recurssion(n-2);
    }
    public static int climbStairs(int n,HashMap<Integer,Integer> memo){
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result=climbStairs_recurssion(n-1)+climbStairs_recurssion(n-2);
        memo.put(n,result);
        return result;
    }
}
