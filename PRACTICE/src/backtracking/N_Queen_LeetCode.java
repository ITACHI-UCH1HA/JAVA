package backtracking;
import java.util.*;
public class N_Queen_LeetCode {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    private static List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return Queens(board,new ArrayList<>(),0);
    }

    private static List<List<String>> Queens(boolean[][] board, List<List<String>> result, int row) {
        if(row== board.length){
            List<String> possible=display(board);
            result.add(possible);
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafeQueen(board,row,col)){
                board[row][col]=true;
                Queens(board,result,row+1);
                board[row][col]=false;
            }
        }
        return result;
    }

    private static boolean isSafeQueen(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for (int i = 1; i <=maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    public static List<String> display(boolean[][] board){
        List<String> ans=new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s="";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]){
                    s+="Q";
                }
                else{
                    s+=".";
                }
            }
            ans.add(s);
        }
        return ans;
    }
}
