package Dynamic_Programming;

import java.util.*;

public class Sum_Possible {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(4);
        System.out.println(sumPossible_Dp(15,list,new HashMap<>()));
    }

    private static boolean sumPossible_Dp(int amount, List<Integer> numbers,Map<Integer,Boolean> memo) {
        if(amount==0){
            return true;
        }
        if(amount<0){
            return false;
        }
        if(memo.containsKey(amount)){
            return memo.get(amount);
        }
        for (int num:numbers) {
            int rem=amount-num;
            boolean result=sumPossible_Dp(rem,numbers,memo);
            memo.put(num,result);
            if(result){
                return result;
            }
        }
        return false;
    }

    public static boolean sumPossible(int amount, List<Integer> numbers) {

//        if the list size is 0 then there is no possible combination so return false;
        if(numbers.size()==0 || amount<0){
            return false;
        }

//        if the amount is already present in the list then return true directly
        if(numbers.contains(amount) || amount==0){
            return true;
        }

//        first sort the list to simplyfy things
        Collections.sort(numbers);

//        if the first element itself if greater than amount then there is no possible way to make the sum
        if(numbers.get(0)>amount){
            return false;
        }

//        if the amount is factor of some element/number of the list
//        then return true directly as the numbers are reusable.
        for (int num:numbers) {
            if(num>amount){
                break;
            }
            if(amount%num==0){
                return true;
            }
        }
//        now make it recursive to find the possible
        return canPossible(numbers,amount);
    }
    public static boolean canPossible(List<Integer> numbers,int amount){
        if(amount==0){
            return true;
        }
        if(amount<0){
            return false;
        }
        for (int num:numbers) {
            int remainder=amount-num;
            if(canPossible(numbers,remainder)){
                return true;
            }
        }
        return false;
    }
}
