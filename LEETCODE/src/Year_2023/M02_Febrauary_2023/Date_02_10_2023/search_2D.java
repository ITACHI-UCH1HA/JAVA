package Year_2023.M02_Febrauary_2023.Date_02_10_2023;

import java.util.Arrays;

public class search_2D {
    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(Arrays.toString(searchMatrix(matrix, 3)));
    }
    public static int[] searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return new int[]{-1,-1};
        if(matrix.length==1) return binarySearch(matrix,0,0,matrix[0].length-1,target);
        int rstart=0,rend=matrix.length-1,cmid=(matrix[0].length-1)/2;
        while(rstart<(rend-1)){
            int rmid=rstart+(rend-rstart)/2;
            if(matrix[rmid][cmid]==target) return new int[]{rmid,cmid};
            else if(matrix[rmid][cmid]<target) rstart=rmid;
            else rend=rmid;
        }
        if(matrix[rstart][cmid]==target) return new int[]{rstart,cmid};
        if(matrix[rstart+1][cmid]==target) return new int[]{rstart+1,cmid};

        if(target<matrix[rstart][cmid]) return binarySearch(matrix,rstart,0,cmid-1,target);
        if(target>matrix[rstart][cmid]&&target<matrix[rstart][matrix[0].length-1]) return binarySearch(matrix,rstart,cmid+1,matrix[0].length-1,target);
        if(target<matrix[rstart+1][cmid]) return binarySearch(matrix,rstart+1,0,cmid-1,target);
        else return binarySearch(matrix,rstart+1,cmid+1,matrix[0].length-1,target);
    }
    public static int[] binarySearch(int[][] arr,int row,int cstart,int cend,int target ){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(arr[row][mid]==target) return new int[]{row,mid};
            else if(arr[row][mid]<target) cstart=mid+1;
            else cend=mid-1;
        }
        return new int[]{-1,-1};
    }
}
