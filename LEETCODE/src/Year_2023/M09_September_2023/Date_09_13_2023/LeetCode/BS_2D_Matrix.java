package Year_2023.M09_September_2023.Date_09_13_2023.LeetCode;

public class BS_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(searchMatrix(matrix,16));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=matrix.length*matrix[0].length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[mid/n][mid%n]==target){
                return true;
            }else if(matrix[mid/m][mid%n]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}
