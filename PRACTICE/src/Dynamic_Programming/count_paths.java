package Dynamic_Programming;
import java.util.*;

public class count_paths {
    public static void main(String[] args) {
        List<List<String>> grid = List.of(
                List.of("O", "O"),
                List.of("O", "O")
        );
        System.out.println(bruteForce(grid));
    }
    public static int bruteForce(List<List<String>> grid){
        return helper(0,0,grid);
    }
    public static int countPaths(List<List<String>> grid){
        return helper(0,0,new HashMap<>(),grid);
    }
    public static int helper(int r,int c,HashMap<List<Integer>,Integer> memo,List<List<String>> grid){
        if(r==grid.size() || c==grid.get(0).size()){
            return 0;
        }
        if(grid.get(r).get(c)=="X"){
            return 0;
        }
        if(r==grid.size()-1 && c==grid.get(0).size()-1){
            return 1;
        }
        List<Integer> ans=List.of(r,c);
        if(memo.containsKey(ans)){
            return memo.get(ans);
        }

        int result=helper(r+1,c,memo,grid)+helper(r,c+1,memo,grid);
        memo.put(ans,result);
        return result;
    }
    public static int helper(int r,int c,List<List<String>> grid){
        if(grid.size()==r || grid.get(0).size()==c){
            return 0;
        }
        if(grid.get(r).get(c)=="X"){
            return 0;
        }
        if(grid.size()-1==r && grid.get(0).size()-1==c){
            return 1;
        }
        return helper(r+1,c,grid)+helper(r,c+1,grid);
    }
}
