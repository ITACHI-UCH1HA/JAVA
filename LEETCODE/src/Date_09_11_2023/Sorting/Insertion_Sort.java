package Date_09_11_2023.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
    public static int[] sort(int[] nums){
        for (int i = 1; i < nums.length-1; i++) {
            for (int j = i; j >=0 ; j--) {
                if(nums[j]<nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1
                            ]=temp;
                }
            }
        }
        return nums;
    }
}
