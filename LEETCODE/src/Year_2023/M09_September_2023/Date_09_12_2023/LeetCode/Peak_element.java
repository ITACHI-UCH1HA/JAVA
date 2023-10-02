package Year_2023.M09_September_2023.Date_09_12_2023.LeetCode;

public class Peak_element {
    public static void main(String[] args) {
        int nums[]={5,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0){
                if(nums[0]>nums[1]) return 0;
                else return 1;
            }
            if(mid==nums.length-1){

            }
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid-1]>nums[mid]) right=mid-1;
            else if(nums[mid+1]>nums[mid]) left=mid+1;
        }
        return -1;
    }
}
