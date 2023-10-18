package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class MinCoins {
    public static void main(String[] args) {
        System.out.println(minChange_Dp(8,List.of(1,5,4,12),new HashMap<>()));
    }

    private static int minChange_Dp(int amount, List<Integer> coins,HashMap<Integer,Integer> memo) {
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return -1;
        }
        if(memo.containsKey(amount)){
            return memo.get(amount);
        }
        int min=-1;
        for (int num:coins) {
            int subAmount=amount-num;
            int subCoins=minChange_Dp(subAmount,coins,memo);

            if(subCoins!=-1){
                if(min==-1){
                    min=subCoins+1;
                }else{
                    min=Math.min(min,subCoins+1);
                }
                memo.put(num,min);
            }else{
                memo.put(num,-1);
            }
        }
        return min;
    }

    private static int minChange(int amount,List<Integer> coins) {
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return -1;
        }
        int min=-1;
        for (int num:coins) {
            int subAmount=amount-num;
            int subCoins=minChange(subAmount,coins);
            if(subCoins!=-1){
                if(min==-1){
                    min=subCoins+1;
                }
                min=Math.min(min,subCoins+1);
            }
        }
        return min;
    }
}
