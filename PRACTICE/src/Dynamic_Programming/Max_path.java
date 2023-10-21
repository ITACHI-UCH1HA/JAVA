package Dynamic_Programming;
import java.util.*;

public class Max_path {
    public static void main(String[] args) {
        List<List<Integer>> grid = List.of(
                List.of(1, 3, 12),
                List.of(5, 1, 1),
                List.of(3, 6, 1)
        );
        System.out.println(maxPathSum(grid));
    }
    public static int maxPathSum(List<List<Integer>> grid) {
        return dynamicProgramming(0,0,grid,new HashMap<>());
    }
    public static int helper(int r,int c,List<List<Integer>> grid,int sum){
        if(grid.size()==r || grid.get(0).size()==c){
            return 0;
        }
        if(grid.size()-1==r && grid.get(0).size()-1==c){
            return sum+grid.get(r).get(c);
        }

        return Math.max(helper(r+1,c,grid,sum+grid.get(r).get(c)),helper(r,c+1,grid,sum+grid.get(r).get(c)));
    }
    public static int dynamicProgramming(int r,int c,List<List<Integer>> grid,HashMap<List<Integer>,Integer> memo){
        if(grid.size()==r || grid.get(0).size()==c){
            return 0;
        }

        if(grid.size()-1==r && grid.get(0).size()-1==c){
            return grid.get(r).get(c);
        }
        List<Integer> ans=List.of(r,c);
        if(memo.containsKey(ans)){
            return memo.get(ans);
        }

        int result=Math.max(dynamicProgramming(r+1,c,grid,memo),dynamicProgramming(r,c+1,grid,memo))+grid.get(r).get(c);
        memo.put(ans,result);
        return result;
    }
}
