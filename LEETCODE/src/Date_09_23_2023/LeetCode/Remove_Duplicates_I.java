package Date_09_23_2023.LeetCode;

import java.util.Arrays;

public class Remove_Duplicates_I {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
