package maze;

public class printing_paths {
    public static void main(String[] args) {
        print_paths("",3,3);
    }

    private static void print_paths(String string, int row, int column) {
        if(row==1 && column==1){
            System.out.println(string);
            return;
        }
        if(row>1) print_paths(string+"D",row-1,column);
        if(column>1) print_paths(string+"R",row,column-1);
    }
}
