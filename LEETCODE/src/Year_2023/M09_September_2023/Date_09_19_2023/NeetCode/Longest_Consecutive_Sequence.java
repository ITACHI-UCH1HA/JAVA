package Year_2023.M09_September_2023.Date_09_19_2023.NeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive_IV(nums));
    }
    public static int longestConsecutive_I(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for (int num:nums) {
            numSet.add(num);
        }
        int longStreak=0;
        return 1;
    }
    private static int longestConsecutive_II(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> sequenceMap = new HashMap<>();
        int longestStreak = 0;

        for (int num : nums) {
            if (!sequenceMap.containsKey(num)) {
                int leftBoundary = sequenceMap.getOrDefault(num - 1, 0);
                int rightBoundary = sequenceMap.getOrDefault(num + 1, 0);

                int currentStreak = leftBoundary + rightBoundary + 1;
                longestStreak = Math.max(longestStreak, currentStreak);

                // Update boundaries to include the current streak
                sequenceMap.put(num - leftBoundary, currentStreak);
                sequenceMap.put(num + rightBoundary, currentStreak);

                // Keep track of the current number for future computations
                sequenceMap.put(num, currentStreak);
            }
        }

        return longestStreak;
    }
    private static int longestConsecutive_III(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the array and find the longest consecutive sequence
        for (int num : numSet) {
            // If num-1 is not in the set, it is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for consecutive numbers starting from currentNum
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
    private static int longestConsecutive_IV(int[] nums) {
        Map<Integer,Integer> ranges = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (ranges.containsKey(num)) continue;

            // 1.Find left and right num
            int left = ranges.getOrDefault(num - 1, 0);
            int right = ranges.getOrDefault(num + 1, 0);
            int sum = left + right + 1;
            max = Math.max(max, sum);

            // 2.Union by only updating boundary
            // Leave middle k-v dirty to avoid cascading update
            if (left > 0) ranges.put(num - left, sum);
            if (right > 0) ranges.put(num + right, sum);
            ranges.put(num, sum); // Keep each number in Map to de-duplicate
        }
        return max;
    }
}
