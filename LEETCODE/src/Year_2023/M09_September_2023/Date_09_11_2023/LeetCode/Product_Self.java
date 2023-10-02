package Year_2023.M09_September_2023.Date_09_11_2023.LeetCode;

import java.util.Arrays;

public class Product_Self {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelfII(nums)));
    }

    private static int[] productExceptSelfII(int[] nums) {
        int[] pref=new int[nums.length];
        pref[0]=1;
        for (int i = 1; i < nums.length ; i++) {
            pref[i]=nums[i-1]*pref[i-1];
        }
        int rightproduct=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            pref[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return pref;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length];
        pref[0]=1;
//        product of prefixes
        for (int i = 1; i < nums.length; i++) {
            pref[i]=nums[i-1]*pref[i-1];
        }
        System.out.println(Arrays.toString(pref));
        int[] suff=new int[nums.length];
        suff[nums.length-1]=1;
//        product of suffixes
        for (int i = nums.length-2; i >=0; i--) {
            suff[i]=nums[i+1]*suff[i+1];
        }
        System.out.println(Arrays.toString(suff));
//        product of prefix and suffix
        for (int i = 0; i < nums.length; i++) {
            nums[i]=pref[i]*suff[i];
        }
        return nums;
    }
    public static int[] prefixSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
