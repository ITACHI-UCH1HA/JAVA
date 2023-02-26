package Date_01_21_2023;

public class maximum_subarray{
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;
        for (int i = 0; i < nums.length; i++) {
            current_sum+=nums[i];
            max_sum=Math.max(max_sum,current_sum);
            if(current_sum<0) current_sum=0;
        }
        return max_sum;
    }
}
