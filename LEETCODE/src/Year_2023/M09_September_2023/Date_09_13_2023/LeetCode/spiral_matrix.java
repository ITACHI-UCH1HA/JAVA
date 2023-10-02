package Year_2023.M09_September_2023.Date_09_13_2023.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        List<Integer> a=spiralOrder(matrix);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while (top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >=left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >=top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
