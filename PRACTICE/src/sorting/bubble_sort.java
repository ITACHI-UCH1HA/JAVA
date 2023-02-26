package sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,6,5,5,52,2,2,1};
        System.out.println(Arrays.toString(bubble_sorted(arr,arr.length-1,0)));
    }

    private static int[] bubble_sorted(int[] arr,int row,int column) {
        if(row==0) return arr;
        if(column<row){
            if(arr[column]>arr[column+1]){
                int temp=arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
            bubble_sorted(arr,row,column+1);
        }else bubble_sorted(arr,row-1,0);
        return arr;
    }
}
