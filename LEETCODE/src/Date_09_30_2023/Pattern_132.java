package Date_09_30_2023;
import java.util.*;
public class Pattern_132 {
    public static void main(String[] args) {
        int[] nums={3,1,4,2};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int n = nums.length;
        int[] minPrefix = new int[n];
        minPrefix[0] = nums[0];

        // Create an array to store the minimum value from the left end
        for (int i = 1; i < n; i++) {
            minPrefix[i] = Math.min(minPrefix[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int j = n - 1; j >= 0; j--) {
            // Check if the current element is greater than the minimum value on the left
            if (nums[j] > minPrefix[j]) {
                // We have found a potential candidate for "2"
                // Now, we need to find a "1" on the left (smaller than nums[j])
                while (!stack.isEmpty() && stack.peek() <= minPrefix[j]) {
                    stack.pop();
                }

                // If we find a "1" on the left, and it is smaller than nums[j], return true
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }

                // Push nums[j] to the stack as a potential candidate for "3"
                stack.push(nums[j]);
            }
        }

        return false;
    }
}
