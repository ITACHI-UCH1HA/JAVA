package Year_2023.M09_September_2023.Date_09_21_2023.NeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int Tsum=(nums.length*(nums.length+1))/2;
        return Tsum-sum;
    }
}
