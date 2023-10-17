package Year_2023.M10_October_2023.Date_17;

import java.util.Arrays;

public class highestProduct {
    public static void main(String[] args) {
        int[] A={-5,-2,1, 2, 3, 4};
        System.out.println(maxp3(A));
    }
    public static int maxp3(int[] A) {
        Arrays.sort(A);
        int lscore=A[0]*A[1]*A[A.length-1];
        int hscore=A[A.length-1]*A[A.length-2]*A[A.length-3];
        return Math.max(lscore,hscore);
    }
}
