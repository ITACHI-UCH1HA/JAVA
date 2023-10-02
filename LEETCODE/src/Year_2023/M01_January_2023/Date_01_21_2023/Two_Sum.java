//https://leetcode.com/problems/two-sum/?envType=study-plan&id=data-structure-i

package Year_2023.M01_January_2023.Date_01_21_2023;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            if(helper(nums,target,i)!=0) return new int[]{i,helper(nums,target,i)};
        }
        return new int[]{-1,-1};
    }

    private static int helper(int[] nums, int target, int index) {
        for (int i = index+1; i < nums.length; i++) {
            if(nums[index]+nums[i]==target) return i;
        }
        return 0;
    }
}
