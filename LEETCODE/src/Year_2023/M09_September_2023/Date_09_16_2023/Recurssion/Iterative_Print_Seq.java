package Year_2023.M09_September_2023.Date_09_16_2023.Recurssion;

import java.util.ArrayList;

public class Iterative_Print_Seq {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(Subset_nums(nums));
    }
    public static ArrayList<ArrayList<Integer>> Subset_nums(int[] nums){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            ArrayList<ArrayList<Integer>> ans=list;
            for (int j = 0; j < ans.size(); j++) {
                ans.get(j).add(nums[i]);
            }
            list.addAll(ans);
        }
        return list;
    }
}
