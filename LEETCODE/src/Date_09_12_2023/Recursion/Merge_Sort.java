package Date_09_12_2023.Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,4};
        System.out.println(Arrays.toString(Merge_sorted(nums)));
    }

    private static int[] Merge_sorted(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int mid= nums.length/2;
        int[] leftside=Merge_sorted(Arrays.copyOfRange(nums,0,mid));
        int[] rightside=Merge_sorted(Arrays.copyOfRange(nums,mid,nums.length));
        return Merge(leftside,rightside);
    }

    private static int[] Merge(int left[], int right[]) {
        int i=0,j=0,k=0;
        int[] ans=new int[left.length+ right.length];
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}
