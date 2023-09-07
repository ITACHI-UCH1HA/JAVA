package Date_07_13_2023;

import java.util.Arrays;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int count=0;
        int[] sorted=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curr=nums[i];
            for (int j = 0; j < nums.length; j++) {
                 
            }
            count=0;
        }
        return new int[]{};
    }
}
