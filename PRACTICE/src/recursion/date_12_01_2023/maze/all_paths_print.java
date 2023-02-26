package recursion.date_12_01_2023.maze;

public class all_paths_print {
    public static void main(String[] args) {
        printing_all_paths("",3,3);
    }

    private static void printing_all_paths(String s, int r, int c) {
        if(r==1&&c==1){
            System.out.println(s);
            return;
        }
        if(r>1) printing_all_paths(s+'D',r-1,c);
        if(c>1) printing_all_paths(s+'R',r,c-1);
        if(r>1&&c>1) printing_all_paths(s+'C',r-1,c-1);
    }
}
