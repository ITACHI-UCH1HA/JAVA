package Year_2023.M10_October_2023.Date_07;
import java.util.*;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom= matrix.length-1;

        while(top<=bottom){
            for (int i = left; i <=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for (int i = bottom; i >=top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }

        return result;
    }
}
