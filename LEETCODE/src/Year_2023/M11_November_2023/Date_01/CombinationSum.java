package Year_2023.M11_November_2023.Date_01;
import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates={6,7,3,2};
        System.out.println(combinationSums(candidates,7));
    }

    private static List<List<Integer>> combinationSums(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<List<Integer>>> dp = new ArrayList<>();
        dp.add(new ArrayList<>()); // Initialize with an empty combination
        for (int t = 1; t <= target; t++) {
            List<List<Integer>> combinations = new ArrayList<>();
            for (int candidate : candidates) {
                if (candidate > t) {
                    break;
                }
                for (List<Integer> prevCombination : dp.get(t - candidate)) {
                    if (prevCombination.isEmpty() || candidate >= prevCombination.get(prevCombination.size() - 1)) {
                        List<Integer> newCombination = new ArrayList<>(prevCombination);
                        newCombination.add(candidate);
                        combinations.add(newCombination);
                    }
                }
            }
            dp.add(combinations);
        }
        return dp.get(target);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> currentList=new ArrayList<>();
        combinationSum(candidates,target,0,currentList,result);
        return result;
    }
    public static void combinationSum(int[] candidates, int target,int start,List<Integer> currentList,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(currentList));
            return;
        }
        if(target<0){
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            combinationSum(candidates,target-candidates[i],i,currentList,result);
            currentList.remove(currentList.size()-1);
        }
    }
}
