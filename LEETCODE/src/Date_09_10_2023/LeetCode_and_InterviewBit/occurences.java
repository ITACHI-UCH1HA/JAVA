package Date_09_10_2023.LeetCode_and_InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class occurences {
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(Arrays.toString(findOccurences(nums)));
    }
    public static int[] findOccurences(int[] nums) {
        if(nums.length==1) return new int[]{1};
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int count=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                count++;
                continue;
            }
            list.add(count);
            count=1;
        }
//        if(nums[nums.length-1]!=nums[nums.length-2]){
//            list.add(1);
//        }
        int[] ans=new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
