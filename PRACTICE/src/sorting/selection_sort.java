package sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,6,5,5,52,2,2,1};
        System.out.println(Arrays.toString(selection_sorted(arr,arr.length,0,0)));
    }

    private static int[] selection_sorted(int[] arr, int row, int column,int max_index) {
        if(row==0) return arr;
        if(column<row-1){
            if(arr[column]>arr[max_index]){
                selection_sorted(arr,row,column+1,column);
            }else selection_sorted(arr,row,column+1,max_index);
        }
        else {
            int temp=arr[max_index];
            arr[max_index]=arr[column];
            arr[column]=temp;
            selection_sorted(arr,row-1,0,0);
        }
        return arr;
    }
}
