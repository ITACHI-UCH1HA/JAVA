package Date_09_26_2023;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets_II(nums));
    }



    public static List<List<Integer>>  subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int n= result.size();
            for (int j = 0; j < n; j++) {
                List<Integer> list=new ArrayList<>(result.get(j));
                list.add(nums[i]);
                result.add(list);
            }
        }
        return result;
    }
    private static List<List<Integer>> subsets_II(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(result,0,nums,list);
        return result;
    }
    private static void helper(List<List<Integer>> result,int start,int[] nums,List<Integer> list){
        if(start>= nums.length){
            result.add(new ArrayList<>(list));
        }else {
            list.add(nums[start]);
            helper(result,start+1,nums,list);
            list.remove(list.size()-1);
            helper(result,start+1,nums,list);
        }
    }
}
