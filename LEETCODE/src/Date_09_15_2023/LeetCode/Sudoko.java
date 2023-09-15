package Date_09_15_2023.LeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sudoko {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        int n=board.length;
        Set<Character>[] rows= new HashSet[9];
        Set<Character>[] colums=new HashSet[9];
        Set<Character>[] blocks=new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i]=new HashSet<>();
            colums[i]=new HashSet<>();
            blocks[i]=new HashSet<>();
        }
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                char currentChar=board[row][column];
                if(currentChar=='.'){
                    continue;
                }
                if(rows[row].contains(currentChar)){
                    return false;
                }
                rows[row].add(currentChar);
                if(colums[column].contains(currentChar)){
                    return false;
                }
                colums[column].add(currentChar);
                int blockIndex=n;
            }
        }
        return true;
    }
}
