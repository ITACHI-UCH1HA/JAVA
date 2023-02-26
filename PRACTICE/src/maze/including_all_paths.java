package maze;

public class including_all_paths {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        all_paths("",board,0,0);
    }
    public static void all_paths(String string,boolean[][] board, int row, int column){
        if(row== board.length-1 && column==board[0].length-1){
            System.out.println(string);
            return;
        }
        if(!board[row][column]) return;
        board[row][column]=false;
        if(row< board.length-1) all_paths(string+"Down ",board,row+1,column);
        if(row< board.length-1&&column< board[0].length-1) all_paths(string+"Diagonal ",board,row+1,column+1);
        if(column< board[0].length-1) all_paths(string+"Right ",board,row,column+1);
        if(row>0) all_paths(string+"Up ",board,row-1,column);
        if(column>0) all_paths(string+"Up ",board,row,column-1);
        board[row][column]=true;
    }
}

