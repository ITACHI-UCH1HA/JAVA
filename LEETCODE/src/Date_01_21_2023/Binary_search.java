//https://leetcode.com/problems/binary-search/description/?envType=study-plan&id=binary-search-i
package Date_01_21_2023;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[] nums={2,5};
        System.out.println(bsearch(nums,0,nums.length-1,0));
    }

    private static int bsearch(int[] nums,int start,int end, int target) {
        if(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) return bsearch(nums,mid+1,end,target);
            else return bsearch(nums,start,mid-1,target);
        }
        return -1;
    }

    private static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0,end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
