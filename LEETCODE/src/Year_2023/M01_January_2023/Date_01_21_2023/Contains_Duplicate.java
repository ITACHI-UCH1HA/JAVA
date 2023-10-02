package Year_2023.M01_January_2023.Date_01_21_2023;

import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println( containsDuplicate(new int[]{1,2,3,4,5}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int n = 0; n < nums.length-1; n++) {
            if(nums[n]==nums[n+1]) return true;
        }
        return false;
    }
}
