package Year_2023.M01_January_2023.Date_01_21_2023;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        three_pointer(nums1, 3, nums2, nums2.length);
    }

    private static void three_pointer(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]) nums1[k--]=nums1[i--];
            else nums1[k--]=nums2[j--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void insertion_sort(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m-n]=nums2[i];
            m++;
        }
        for (int i = 0; i < nums1.length-1; i++) {
            for (int j = i+1; j > 0  ; j--) {
                if(nums1[j]<nums1[j-1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
