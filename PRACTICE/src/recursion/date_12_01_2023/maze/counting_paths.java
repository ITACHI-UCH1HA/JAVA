package recursion.date_12_01_2023.maze;

public class counting_paths {
    public static void main(String[] args) {
        System.out.println(paths(3,3));
    }

    private static int paths(int r, int c) {
        if(r==1||c==1) return 1;
        int down=paths(r-1,c);
        int right=paths(r,c-1);
        return right+down;
    }
}
