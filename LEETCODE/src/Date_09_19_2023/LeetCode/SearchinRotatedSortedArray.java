package Date_09_19_2023.LeetCode;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,0,1,2,3};
        System.out.println(search(nums,1));
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
//            left half is sorted
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
//            right half is sorted
            else {
                if(target<=nums[right] && target>nums[mid]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
