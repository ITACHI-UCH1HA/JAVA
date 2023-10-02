package Year_2023.M10_October_2023.Date_02;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin2(nums));
    }

    private static int findMin2(int[] nums) {
        int min=nums[nums.length-1];
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=nums[right]){
                
            }
        }
        return min;
    }

    public static int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int min=nums[0];
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=nums[left]){
                if(min>nums[left]){
                    min=nums[left];
                }
                left=mid+1;
            }else{
                if(min>nums[mid]){
                    min=nums[mid];
                }
                right=mid-1;
            }
        }
        return min;
    }
}
