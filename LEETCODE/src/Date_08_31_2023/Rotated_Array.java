package Date_08_31_2023;

import java.util.Arrays;

public class Rotated_Array {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int search1(int[] nums, int target) {
        int pivot=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]) {
                pivot=i+1;
                break;
            }
        }
        Arrays.sort(nums);
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) return (mid+pivot)%nums.length;
            else if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}
