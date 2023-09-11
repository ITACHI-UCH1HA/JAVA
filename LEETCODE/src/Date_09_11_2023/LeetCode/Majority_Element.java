package Date_09_11_2023.LeetCode;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement2(nums));
    }

    private static int majorityElement2(int[] nums) {
        int majority=nums[0];
        int count=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==majority) count++;
            else{
                count--;
                if(count==0){
                    majority=nums[i];
                    count++;
                }
            }
        }
        return majority;
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
