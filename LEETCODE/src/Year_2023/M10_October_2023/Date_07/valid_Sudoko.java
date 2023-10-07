package Year_2023.M10_October_2023.Date_07;

import java.util.HashSet;

public class valid_Sudoko {
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

        boolean result = isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + result);
    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] block=new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            block[i]=new HashSet<>();
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                char currChar=board[row][col];
                if(currChar=='.'){
                    continue;
                }
                if(rows[row].contains(currChar)){
                    return false;
                }
                rows[row].add(currChar);
                if(cols[col].contains(currChar)){
                    return false;
                }
                cols[col].add(currChar);
                int blockIndex=3*(row/3)+(col/3);
                if(block[blockIndex].contains(currChar)){
                    return false;
                }
                block[blockIndex].add(currChar);
            }
        }
        return true;
    }
}
