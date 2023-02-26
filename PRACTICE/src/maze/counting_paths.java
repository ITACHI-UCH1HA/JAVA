package maze;

public class counting_paths {
    public static void main(String[] args) {
        System.out.println(paths("",3,3));
    }

    private static int paths(String string, int row, int column) {
        if(row==1||column==1) return 1;
        int right=paths(string+"R",row,column-1);
        int down=paths(string+"D",row-1,column);
        return right+down;
    }
}
