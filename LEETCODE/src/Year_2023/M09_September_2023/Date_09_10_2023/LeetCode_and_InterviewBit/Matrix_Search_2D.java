package Year_2023.M09_September_2023.Date_09_10_2023.LeetCode_and_InterviewBit;

public class Matrix_Search_2D {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m= matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            int midvalue=matrix[mid/n][mid%n];
            if(midvalue==target){
                return true;
            }
            else if (midvalue<target) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return false;
    }
}
