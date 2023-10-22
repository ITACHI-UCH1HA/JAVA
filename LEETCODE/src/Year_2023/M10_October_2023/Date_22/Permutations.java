package Year_2023.M10_October_2023.Date_22;
import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);

        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        generatePermutations(nums,used,current,result);
        return result;
    }

    private static void generatePermutations(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                generatePermutations(nums, used, current, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
