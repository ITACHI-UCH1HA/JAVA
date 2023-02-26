package maze;

public class diagonal_paths {
    public static void main(String[] args) {
        print_diagonal_paths("",3,3);
    }

    public static void print_diagonal_paths(String string, int row, int column) {
        if(row==1 && column==1){
            System.out.println(string);
            return;
        }

        if(row>1) print_diagonal_paths(string+"V",row-1,column);
        if(row>1&&column>1) print_diagonal_paths(string+"D",row-1,column-1);
        if(column>1) print_diagonal_paths(string+"H",row,column-1);
    }
}
