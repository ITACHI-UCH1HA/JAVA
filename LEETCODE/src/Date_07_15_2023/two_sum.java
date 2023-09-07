package Date_07_15_2023;
import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(sum_two_nums(nums,5)));
    }

    private static int[] sum_two_nums(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target) return new int[]{i,j};
            else if(nums[i]+nums[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
