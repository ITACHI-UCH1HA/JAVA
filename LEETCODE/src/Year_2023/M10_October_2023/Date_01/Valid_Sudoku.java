package Year_2023.M10_October_2023.Date_01;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {
    public static void main(String[] args) {
        char[][] sudokuBoard = {
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
        boolean isValid =isValidSudoku(sudokuBoard);

        if (isValid) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is not valid.");
        }
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currchar=board[i][j];
                if(currchar=='.'){
                    continue;
                }
                if(rows[i].contains(currchar)){
                    return false;
                }
                rows[i].add(currchar);
                if(columns[j].contains(currchar)){
                    return false;
                }
                columns[j].add(currchar);
                int blockIndex=3*(i/3)+j/3;
                if(blocks[blockIndex].contains(currchar)){
                    return false;
                }
                blocks[blockIndex].add(currchar);
            }
        }
        return true;
    }
}
