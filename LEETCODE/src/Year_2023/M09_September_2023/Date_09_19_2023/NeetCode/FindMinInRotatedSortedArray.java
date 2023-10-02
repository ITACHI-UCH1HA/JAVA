package Year_2023.M09_September_2023.Date_09_19_2023.NeetCode;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={5,1,2,3,4};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int min=nums[0];
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                if(min>nums[left]){
                    min=nums[left];
                }
                left=mid+1;
            }else{
                if(nums[mid]<min){
                    min=nums[mid];
                }
                right=mid-1;
            }
        }
        return min;
    }
}
