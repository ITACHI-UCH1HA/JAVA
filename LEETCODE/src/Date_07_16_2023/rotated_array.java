package Date_07_16_2023;

import java.util.Arrays;

public class rotated_array {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(Arrays.toString(rotate(nums,3)));
    }

    private static int[] rotate_reverse(int[] nums, int k) {
        reverser(nums,0,nums.length-1);
        reverser(nums,0,k-1);
        reverser(nums,k, nums.length-1);
        return nums;
    }
    public static int[] reverser(int[] nums,int p1,int p2){
        while(p1<p2){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p1++;
            p2--;
        }
        return nums;
    }

    private static int[] rotate(int[] nums, int k) {
        int p1 = 0;
        int p2 = nums.length - 1;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
            }
            p1=0;
        }
        return nums;
    }
}
