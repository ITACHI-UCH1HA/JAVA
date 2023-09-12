package Date_09_12_2023.Recursion;

import java.util.Arrays;

public class In_Place_Merge_Sorted {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,4};
        Merge_sorted(nums,0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
    private static void Merge_sorted(int[] nums,int left,int right) {
        if(right-left==1){
            return;
        }
        int mid= left+(right-left)/2;
        Merge_sorted(nums,left,mid);
        Merge_sorted(nums,mid,right);
        Merge(nums,left,right,mid);
    }

    private static void Merge(int nums[],int left,int right,int mid) {
        int[] ans=new int[right-left];
        int i=left,j=mid,k=0;
        while(i< mid && j< right){
            if(nums[i]<nums[j]){
                ans[k]=nums[i];
                i++;
            }
            else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i< mid){
            ans[k]=nums[i];
            i++;
            k++;
        }
        while(j< right){
            ans[k]=nums[j];
            j++;
            k++;
        }
        for (int p = 0; p < k; p++) {
            nums[left + p] = ans[p];
        }
    }
}
