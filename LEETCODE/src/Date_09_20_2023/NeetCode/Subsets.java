package Date_09_20_2023.NeetCode;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        Subsets solution = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num:nums) {
            int size= result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> subset=new ArrayList<>(result.get(j));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }
}
