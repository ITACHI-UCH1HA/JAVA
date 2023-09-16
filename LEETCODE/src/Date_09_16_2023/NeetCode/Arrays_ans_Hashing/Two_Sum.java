package Date_09_16_2023.NeetCode.Arrays_ans_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum_I(nums,132)));
    }

    private static int[] twoSum_II(int[] nums, int target) {
        int[] ans=new int[2];
        int i=0,j=1;
        while(i< nums.length && j< nums.length){
        }
        return new int[]{};
    }

    public static int[] twoSum_I(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
