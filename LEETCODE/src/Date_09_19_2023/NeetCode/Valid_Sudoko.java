package Date_09_19_2023.NeetCode;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoko {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku_II(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        int n=board.length;
        Set<Integer>[] rows=new Set[9];
        Set<Integer>[] columns=new Set[9];
        Set<Integer>[] blocks=new Set[9];
        for (int i = 0; i < n; i++) {
            rows[i]=new HashSet<>();
            columns[i]=new HashSet<>();
            blocks[i]=new HashSet<>();
        }
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                int currchar=board[row][column];
                if(currchar=='.'){
                    continue;
                }
                if(rows[row].contains(currchar)){
                    return false;
                }
                rows[row].add(currchar);
                if(columns[column].contains(currchar)){
                    return false;
                }
                columns[column].add(currchar);
                int blockIndex=(row/3)+3*(column/3);
                if(blocks[blockIndex].contains(currchar)){
                    return false;
                }
                blocks[blockIndex].add(currchar);
            }
        }
        return true;
    }
    public static boolean isValidSudoku_II(char[][] board) {
        for (int i = 0; i < 9; i++) {
            // Initialize sets to check for duplicates in rows, columns, and sub-grids
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> subGridSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Check rows
                if (board[i][j] != '.' && !rowSet.add(board[i][j]))
                    return false;

                // Check columns
                if (board[j][i] != '.' && !colSet.add(board[j][i]))
                    return false;

                // Check sub-grids
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                char subGridChar = board[rowIndex + j / 3][colIndex + j % 3];
                if (subGridChar != '.' && !subGridSet.add(subGridChar))
                    return false;
            }
        }

        return true;
    }
}
