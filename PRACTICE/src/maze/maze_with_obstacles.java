package maze;

public class maze_with_obstacles {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        print_with_obstacles_paths("",board,0,0);
    }

    private static void print_with_obstacles_paths(String string, boolean[][] board,int row, int column) {
        if(row== board.length-1 && column==board[0].length-1){
            System.out.println(string);
            return;
        }
        if(!board[row][column]) return;
        if(row< board.length-1) print_with_obstacles_paths(string+"V",board,row+1,column);
        if(row< board.length-1&&column< board[0].length-1) print_with_obstacles_paths(string+"D",board,row+1,column+1);
        if(column< board[0].length-1) print_with_obstacles_paths(string+"H",board,row,column+1);
    }
}
