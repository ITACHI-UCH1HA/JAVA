package Year_2023.M09_September_2023.Date_09_16_2023.NeetCode.Arrays_ans_Hashing;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(containsDuplicate_III(nums));
    }
    public static boolean containsDuplicate_I(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate_II(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static boolean containsDuplicate_III(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
//        for (int num:nums) {
//            if(map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//            }
//            else{
//                map.put(num,1);
//            }
//        }
        for (int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int count: map.values()) {
            if(count>1){
                return true;
            }
        }
        return false;
    }
}
