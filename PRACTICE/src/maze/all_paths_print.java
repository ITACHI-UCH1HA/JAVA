package maze;

import java.util.Arrays;

public class all_paths_print {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
      matrix_path_print("",board,0,0,path,1);
    }
    public static void matrix_path_print(String string,boolean[][] board, int row, int column,int[][] path,int step){
        if(row== board.length-1 && column==board[0].length-1){
            path[row][column]=step;
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(string);
            return;
        }
        if(!board[row][column]) return;
        board[row][column]=false;
        path[row][column]=step;
        if(row< board.length-1) matrix_path_print(string+"Down ",board,row+1,column,path,step+1);
        if(row< board.length-1&&column< board[0].length-1) matrix_path_print(string+"Diagonal ",board,row+1,column+1,path,step+1);
        if(column< board[0].length-1) matrix_path_print(string+"Right ",board,row,column+1,path,step+1);
        if(row>0) matrix_path_print(string+"Up ",board,row-1,column,path,step+1);
        if(column>0) matrix_path_print(string+"Up ",board,row,column-1,path,step+1);
        board[row][column]=true;
        path[row][column]=0;
    }
}
