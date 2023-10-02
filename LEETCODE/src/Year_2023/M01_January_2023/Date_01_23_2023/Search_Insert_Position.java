//https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=binary-search-i

package Year_2023.M01_January_2023.Date_01_23_2023;

public class Search_Insert_Position {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2,3,5,6,6},1));
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0,end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return end+1;
    }
}
