package Greedy_technique;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray_2(nums));
    }
    public static int maxSubArray_2(int[] nums){
        return maxSubArray_2(nums,0,nums.length-1);
    }
    public static int maxSubArray_2(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int mid=left+(right-left)/2;
        int leftSum=maxSubArray_2(nums,left,mid);
        int rightSum=maxSubArray_2(nums,mid+1,right);
        int crossSum=totalSum(nums,left,mid,right);
        return Math.max(Math.max(leftSum,rightSum),crossSum);
    }

    private static int totalSum(int[] nums, int left, int mid, int right) {
        int leftMaxSum=Integer.MIN_VALUE;
        int leftSum=0;
        for (int i = left; i <= mid ; i++) {
            leftSum+=nums[i];
            leftMaxSum=Math.max(leftMaxSum,leftSum);
        }
        int rightMaxSum=Integer.MIN_VALUE;
        int rightSum=0;
        for (int i = mid+1; i <=right; i++) {
            rightSum+=nums[i];
            rightMaxSum=Math.max(rightMaxSum,rightSum);
        }
        return leftMaxSum+rightMaxSum;
    }

    public static int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int curr_sum=nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr_sum=Math.max(nums[i],nums[i]+curr_sum);
            max_sum=Math.max(curr_sum,max_sum);
        }

        return max_sum;
    }
}
