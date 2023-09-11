package Date_09_11_2023.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,2};
        System.out.println(removeDuplicates2(nums));
    }

    private static int removeDuplicates2(int[] nums) {
        if(nums.length==1 || nums.length==0) return nums.length;
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    //this method fails in edge cases
    public static int removeDuplicates(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            nums[k]=nums[nums.length-1];
            k++;
        }else{
            k++;
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
