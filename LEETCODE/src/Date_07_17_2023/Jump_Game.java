package Date_07_17_2023;

public class Jump_Game {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(can_Jump(nums));
    }

    private static boolean can_Jump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
