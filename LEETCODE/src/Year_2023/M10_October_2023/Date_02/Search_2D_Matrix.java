package Year_2023.M10_October_2023.Date_02;

public class Search_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right= matrix.length* matrix[0].length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(matrix[mid/ matrix[0].length][mid%matrix[0].length]==target){
                return true;
            }else if(matrix[mid/ matrix[0].length][mid%matrix[0].length]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 30;
        boolean found = searchMatrix(matrix, target);
        System.out.println("Is " + target + " found in the matrix? " + found);
    }
}
