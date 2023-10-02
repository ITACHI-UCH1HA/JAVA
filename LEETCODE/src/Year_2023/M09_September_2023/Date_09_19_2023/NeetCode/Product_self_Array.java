package Year_2023.M09_September_2023.Date_09_19_2023.NeetCode;

import java.util.Arrays;

public class Product_self_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftproduct=new int[nums.length];
        leftproduct[0]=1;
        for (int i = 1; i < nums.length; i++) {
            leftproduct[i]=nums[i-1]*leftproduct[i-1];
        }
        int rightproduct=1;
        for (int i = nums.length-1; i >=0; i--) {
            leftproduct[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return leftproduct;
    }
}
