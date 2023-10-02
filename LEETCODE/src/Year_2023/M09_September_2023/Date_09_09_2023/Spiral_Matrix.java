package Year_2023.M09_September_2023.Date_09_09_2023;
import java.util.*;
public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(spiralOrder2(matrix)));
    }

    private static int[] spiralOrder2(int[][] matrix) {
        int[] ans=new int[matrix.length*matrix[0].length];
        int k=0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while (top<=bottom && left<=right){
//            traverse the top row
            for (int i = left; i <=right; i++) {
                ans[k]=matrix[top][i];
                k++;
            }
            top++;
//            traverse the right most column
            for (int i = top; i <=bottom; i++) {
                ans[k]=matrix[i][right];
                k++;
            }
            right--;
//            traverse from right most column to the leftmost column
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    ans[k]=matrix[bottom][i];
                    k++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top; i--) {
                    ans[k]=matrix[i][left];
                    k++;
                }
                left++;
            }
        }
        return ans;
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while (top<=bottom && left<=right){
//            traverse the top row
            for (int i = left; i <=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
//            traverse the right most column
            for (int i = top; i <=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
//            traverse from right most column to the leftmost column
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
