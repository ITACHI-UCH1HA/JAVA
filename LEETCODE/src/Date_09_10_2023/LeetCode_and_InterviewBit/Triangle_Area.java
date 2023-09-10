package Date_09_10_2023.LeetCode_and_InterviewBit;
import java.util.*;
public class Triangle_Area {
    public static void main(String[] args) {
        String[] A={"rrrrr", "rrrrg", "rrrrr", "bbbbb"};
        System.out.println(largestTriangleArea(A));
    }
    public static int largestTriangleArea(String[] A) {
        int n = A.length;
        int m = A[0].length();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] height = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);

        int maxArea = 0;

        // Calculate left boundaries for each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i].charAt(j) == 'r') {
                    left[i] = j;
                    break;
                }
            }
        }

        // Calculate right boundaries for each row
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (A[i].charAt(j) == 'b') {
                    right[i] = j;
                    break;
                }
            }
        }

        // Calculate height for each row
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (A[i].charAt(j) == 'g') {
                    height[i] = n - i - 1;
                    break;
                }
            }
        }

        // Calculate the maximum triangle area
        for (int i = 0; i < n; i++) {
            if (left[i] != -1 && right[i] != -1 && height[i] != 0) {
                maxArea = Math.max(maxArea, (right[i] - left[i] + 1) * height[i]);
            }
        }

        return maxArea;
    }
}
