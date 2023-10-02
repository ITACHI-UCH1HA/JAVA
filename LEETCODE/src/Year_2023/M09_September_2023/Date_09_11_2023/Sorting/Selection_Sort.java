package Year_2023.M09_September_2023.Date_09_11_2023.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
    public static int[] sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int index=i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[index]){
                    index=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
        return nums;
    }
}
