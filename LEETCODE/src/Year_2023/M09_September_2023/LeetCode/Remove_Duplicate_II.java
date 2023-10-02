package Year_2023.M09_September_2023.LeetCode;

import java.util.Arrays;

public class Remove_Duplicate_II {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(removeDuplicates_II(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int count=1;
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                count=1;
                k++;
            }
            if(nums[i]==nums[i-1] && count<2){
                nums[k]=nums[i];
                count++;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
    private static int removeDuplicates_II(int[] nums) {
        int n = nums.length;

        if (n <= 2) {
            return n; // No need to remove duplicates if the array has 2 or fewer elements.
        }

        int k = 2; // Initialize the unique element count, assuming each element can appear at most twice.

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i]; // Found a new unique element, add it to the result.
                k++;
            }
        }

        return k;
    }
}
