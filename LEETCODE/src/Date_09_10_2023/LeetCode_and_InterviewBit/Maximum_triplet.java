package Date_09_10_2023.LeetCode_and_InterviewBit;

import java.util.Arrays;
import java.util.TreeSet;

public class Maximum_triplet {
    public static void main(String[] args) {
        int[] A={2, 5, 3, 1, 4, 9};
        System.out.println(solved3(A));
    }

    private static int solved3(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (A[i] < A[j] && A[j] < A[k]) {
                        int sum = A[i] + A[j] + A[k];
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        return max;
    }

    private static int solved2(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;

        int[] maxRight = new int[n];

        // Calculate the maximum element to the right for each element
        maxRight[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], A[i]);
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(A[0]);

        // Iterate through the array to find the maximum triplet sum
        for (int j = 1; j < n - 1; j++) {
            if (A[j] < maxRight[j + 1]) {
                Integer lower = set.lower(A[j]);
                if (lower != null) {
                    int sum = lower + A[j] + maxRight[j + 1];
                    max = Math.max(max, sum);
                }
            }
            set.add(A[j]);
        }

        return max;
    }

    public static int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < A.length-2; i++) {
            int l=i+1;
            int h=l+1;
            while(h<A.length && l<h){
                if(A[l]<A[i]){
                    l++;
                    h++;
                    continue;
                }
                if(A[h]<A[l]){
                    h++;
                    continue;
                }
                if(A[i]+A[l]+A[h]>max){
                    max=A[i]+A[l]+A[h];
                    l++;
                    h=l+1;
                }else{
                    l++;
                    h=l+1;
                }
            }
        }
        return max;
    }
}
