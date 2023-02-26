package Date_02_07_2023;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan&id=binary-search-i

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8)));
    }

    private static int[] searchRange(int[] nums,int target) {
        if(nums==null ||nums.length==0) return new int[]{-1,-1};
        if(nums[0]==target && nums[nums.length-1]==target) return new int[]{0,nums.length-1};
        int start=0,end= nums.length-1;
        int[] ans=new int[2];
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target) {
                end=mid;
                ans[1]=mid;
            }
            else start=mid+1;
        }

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid;
                ans[0]=mid;
            }
            else end=mid-1;
        }
        return ans;
    }
//    private static int[] searchRange2(int[] nums,int target) {
//        int start=0,end= nums.length-1;
//        int[] ans=new int[2];
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(nums[mid]==target) {
//                start=mid+1;
//                ans[1]=mid;
//            }else if(nums[mid]<target) start=mid+1;
//            else end=mid-1;
//        }
//        start=0;
//        end=nums.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(nums[mid]==target) {
//                end=mid-1;
//                ans[0]=mid;
//            }else if(nums[mid]<target) start=mid+1;
//            else end=mid-1;
//        }
//        return ans;
//    }
}
