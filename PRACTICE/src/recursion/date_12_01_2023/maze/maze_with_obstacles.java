package recursion.date_12_01_2023.maze;

public class maze_with_obstacles {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        print_maze_paths(maze,maze.length,maze[0].length,"");
    }

    private static void print_maze_paths(boolean[][] maze, int row, int column, String s) {
    }
}
