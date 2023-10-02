package Year_2023.M07_July_2023.Date_07_14_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        int[] nums={6,1,5,2,4,7,3};
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
//        System.out.println(Arrays.toString(bubble(nums,0,nums.length)));
        System.out.println(Arrays.toString(merge_sort(nums)));
    }

    private static int[] merge_sort(int[] nums) {
        return new int[]{-1,1};
//        return nums;
    }

//    private static int[] insertion(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//    }

    private static int[] bubble(int[] nums, int start, int end) {
        for (int i = 0; i < end-1; i++) {
            for (int j = 0; j < end-i-1; j++) {
                if(nums[j+1]<nums[j]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    private static int[] selection(int[] nums,int start,int end) {
        for (int i = 0; i < end-1; i++) {
            for (int j = i+1; j < end; j++) {
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
