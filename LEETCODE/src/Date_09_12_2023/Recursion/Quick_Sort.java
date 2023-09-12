package Date_09_12_2023.Recursion;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,4};
        quick_sorted(nums,0, nums.length -1);
        System.out.println(Arrays.toString(nums));
//        Arrays.sort(nums);
    }
    private static void quick_sorted(int[] nums, int left, int right) {
        if(left>=right){
            return;
        }
        int l=left;
        int h=right;
        int mid=left+(right-left)/2;
        int pivot=nums[mid];
        while (l<=h){
            while (nums[l]<pivot){
                l++;
            }
            while (nums[h]>pivot){
                h--;
            }
            if(l<=h){
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                l++;
                h--;
            }
        }
        quick_sorted(nums,left,pivot-1);
        quick_sorted(nums,pivot+1,right);
    }
}
