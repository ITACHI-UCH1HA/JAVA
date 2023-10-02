package Year_2023.M09_September_2023.Date_09_10_2023.LeetCode_and_InterviewBit;

import java.util.Arrays;

public class Noble_Integer {
    public static void main(String[] args) {
        int[] nums={-1,-1,-2,-3,-3};
        System.out.println(solve2(nums));
    }

    private static int solve2(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
            if(A[i]==A[i+1]){
                continue;
            }
            if(A[i]==A.length-i-1) return 1;
        }
        if(A[A.length-1]==0){
            return 1;
        }
        return -1;
    }

    public static int solve(int[] A) {
//        return 1 if there exists a p such that there are p number so other elements greater than p.
        if (A == null || A.length == 0) {
            return -1;
        }

        Arrays.sort(A); //{1,1,2,2,2,3,3}

        for (int i = 0; i < A.length; i++) {
            // If A[i] is equal to the number of integers greater than it,
            // then we have found a valid p, so return 1.
            if(A[i]<0){
                continue;
            }
            if (A[i] == A.length - i - 1) {
                return 1;
            }
        }

        return -1; // No valid p found, so return -1
    }
}
