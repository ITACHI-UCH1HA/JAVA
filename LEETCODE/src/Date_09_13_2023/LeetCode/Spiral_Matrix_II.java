package Date_09_13_2023.LeetCode;

import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int[][] matrix=generateMatrix(3);
        for (int[] i:matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] generateMatrix(int n) {
        int val=1;
        int[][] matrix=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        while (top<=bottom && left<=right && val<=n*n){
            for (int i = left; i <= right; i++) {
                matrix[top][i]=val;
                val++;
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                matrix[i][right]=val;
                val++;
            }
            right--;
            for (int i = right; i >=left; i--) {
                matrix[bottom][i]=val;
                val++;
            }
            bottom--;
            for (int i = bottom; i >=top; i--) {
                matrix[i][left]=val;
                val++;
            }
            left++;
        }
        return matrix;
    }
}
