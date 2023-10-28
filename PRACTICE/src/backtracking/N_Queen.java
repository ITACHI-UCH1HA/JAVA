package backtracking;
import java.util.*;
import java.util.Scanner;

public class N_Queen {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size(number) of the board:");
//        int n= sc.nextInt();
        boolean[][] board=new boolean[4][4];
        System.out.println(queens(board,0));
    }
    public static int queens(boolean[][] board,int row){
        if(row== board.length){
            displays(board);
            System.out.println();
            return 1;
        }

        int count=0;

        for (int column = 0; column < board.length; column++) {
            if(isSafe(board,row,column)){
                board[row][column]=true;
                count+=queens(board,row+1);
                board[row][column]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int column) {
        for (int i = 0; i < row; i++) {
            if(board[i][column]){
                return false;
            }
        }
//        diagonal left
        int left=Math.min(row,column);
        for (int i = 1; i <= left; i++) {
            if(board[row-i][column-i]){
                return false;
            }
        }
//        diagonal right;
        int right=Math.min(row, board.length-column-1);
        for (int i = 1; i <=right; i++) {
            if(board[row-i][column+i]){
                return false;
            }
        }
        return true;
    }

    private static void displays(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
