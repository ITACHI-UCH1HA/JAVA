package Year_2023.M10_October_2023.Date_21;
import java.util.*;
public class combinationSum {
    public static void main(String[] args) {
        int candidates[]={2,3,6,7};
        System.out.println(combination_Sum(candidates,7));
    }
    public static List<List<Integer>> combination_Sum(int[] candidates, int target) {
        return helper(candidates,target,new ArrayList<>());
    }
    public static List<List<Integer>> helper(int[] candidates,int target,List<List<Integer>> list){
        return list;
    }
}
