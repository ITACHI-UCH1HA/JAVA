package Year_2023.M09_September_2023.Date_09_21_2023.NeetCode;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int uniquenNum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            uniquenNum^=nums[i];
        }
        return uniquenNum;
    }
}
