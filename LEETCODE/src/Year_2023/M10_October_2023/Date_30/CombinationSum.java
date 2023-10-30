package Year_2023.M10_October_2023.Date_30;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        dfs(candidates, target, 0, currentList, result);
        return result;
    }

    private void dfs(int[] candidates, int target, int start, List<Integer> currentList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, currentList, result);
            currentList.remove(currentList.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solution.combinationSum(candidates, target);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
