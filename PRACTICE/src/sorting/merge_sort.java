package sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,4,3,6,5};
        inplace_merge_sorted(arr,0,arr.length);
    }

    private static void inplace_merge_sorted(int[] arr,int start,int end) {
        if((end-start)==1) return;
        int mid=start+(end-start)/2;
        inplace_merge_sorted(arr,start,mid);
        inplace_merge_sorted(arr,mid,end);
//        inplace_merge(arr,start,mid,end);
    }

    private static int[] merge_sorted(int[] arr) {
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=merge_sorted(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge_sorted(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while(i< left.length&&j< right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
