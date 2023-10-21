package Dynamic_Programming;

import java.util.List;

public class nonAdjacentSum {
    public static void main(String[] args) {
        List<Integer> nums=List.of(2, 4, 5, 12, 7);
        System.out.println(non_Adjacent(nums));
    }

    private static int non_Adjacent(List<Integer> nums) {
        return non_Adjacent_sum(nums,0);
    }

    private static int non_Adjacent_sum(List<Integer> nums, int index) {
        if(index==nums.size()-1 || index==nums.size()-2 ){
            return nums.get(index);
        }
        int left=non_Adjacent_sum(nums,index+1)+nums.get(index);
        int right=non_Adjacent_sum(nums,index+2)+nums.get(index);
        return Math.max(non_Adjacent_sum(nums,index+1)+nums.get(index),non_Adjacent_sum(nums,index+2)+nums.get(index));
    }
}
