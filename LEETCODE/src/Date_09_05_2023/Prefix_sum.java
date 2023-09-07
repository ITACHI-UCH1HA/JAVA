package Date_09_05_2023;

import java.util.Arrays;

public class Prefix_sum {
    public static void main(String[] args) {
        int[] nums={1,5,2,4,11,2,3};
        System.out.println(Arrays.toString(Sum_II(nums)));
    }

    private static int[] Sum_II(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums;
        for (int i = 1; i < nums.length ; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

    private static int[] Sum(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length==0 || nums.length==1) return nums;
        ans[0]=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            ans[i]=nums[i]+ans[i-1];
        }
        return ans;
    }
}
