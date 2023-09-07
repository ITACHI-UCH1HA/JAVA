package Date_07_13_2023;

import java.util.Arrays;

public class product_self {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf2(int[] nums) {
        int[] leftproduct = new int[nums.length];
        int[] rightproduct = new int[nums.length];
        leftproduct[0] = 1;
        rightproduct[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftproduct[i] = leftproduct[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightproduct[i] = rightproduct[i + 1] * nums[i + 1];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = leftproduct[i] * rightproduct[i];
        }
        return ans;
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] leftproduct=new int[nums.length];
        int[] rightprodtct=new int[nums.length];
        leftproduct[0]=1;
        rightprodtct[nums.length-1]=1;
        for (int i = 1; i < nums.length; i++) {
            leftproduct[i]=leftproduct[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i >=0 ; i--) {
            rightprodtct[i]=rightprodtct[i+1]*nums[i+1];
        }
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=leftproduct[i]*rightprodtct[i];
        }
        return ans;
    }

    public static int[] productExceptSelfBrute(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length;i++){
            ans*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans/nums[i];
        }
        return nums;
    }
}
