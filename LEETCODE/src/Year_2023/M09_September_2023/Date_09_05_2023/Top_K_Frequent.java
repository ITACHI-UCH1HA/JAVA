package Year_2023.M09_September_2023.Date_09_05_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class Top_K_Frequent {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequent(nums,k));
    }
    public static ArrayList<Integer> topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>=k){
                list.add(nums[i]);
                while(nums[i]!=nums[i+1] && i<nums.length-2){
                    i++;
                }
            }
        }
        return list;
    }
}
