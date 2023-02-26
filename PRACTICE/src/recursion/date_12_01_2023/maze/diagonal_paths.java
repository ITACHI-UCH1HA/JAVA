package recursion.date_12_01_2023.maze;

public class diagonal_paths {
    public static void main(String[] args) {
        diagonal_paths_print("",3,3);
    }

    private static void diagonal_paths_print(String s, int r, int c) {
        if(r==1&&c==1){
            System.out.println(s);
            return;
        }
        if(r>1) diagonal_paths_print(s+'V',r-1,c);
        if(c>1) diagonal_paths_print(s+'H',r,c-1);
        if(r>1&&c>1) diagonal_paths_print(s+'D',r-1,c-1);
    }
}
