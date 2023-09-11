package Date_09_11_2023.LeetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length;
        int i=0;
        int j=1;
        int k=1;
        while(i< nums.length && j< nums.length){
            if(nums[i]==nums[j] && k<2){
                i=j+1;
            }
        }
        return 1;
    }
}
