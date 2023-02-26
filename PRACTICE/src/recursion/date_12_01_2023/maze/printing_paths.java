package recursion.date_12_01_2023.maze;

public class printing_paths {
    public static void main(String[] args) {
        print_paths("",3,3);
    }

    private static void print_paths(String s, int r, int c) {
        if(r==1&&c==1){
            System.out.println(s);
            return;
        }
        if(r>1) print_paths(s+'D',r-1,c);
        if(c>1) print_paths(s+'R',r,c-1);
    }
}
