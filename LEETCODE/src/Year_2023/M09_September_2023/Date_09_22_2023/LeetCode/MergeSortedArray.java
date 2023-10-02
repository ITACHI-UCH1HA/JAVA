package Year_2023.M09_September_2023.Date_09_22_2023.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={4,0,0,0,0,0};
        int[] nums2={1,2,3,5,6};
        merge(nums1,1,nums2,5);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if((n==0 && m==0) || n==0){
//            return;
//        }
//        if(m==0){
//            for (int i = 0; i < nums1.length; i++) {
//                nums1[i]=nums2[i];
//            }
//            return;
//        }
//        if(nums2[0]>nums1[m-1]){
//            for (int i = m; i < nums1.length; i++) {
//                nums1[i]=nums2[i-m];
//            }
//            return;
//        }
        int i=m-1,j=n-1,k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
