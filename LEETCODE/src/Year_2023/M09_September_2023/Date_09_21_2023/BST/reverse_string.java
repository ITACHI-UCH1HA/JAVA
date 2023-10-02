package Year_2023.M09_September_2023.Date_09_21_2023.BST;

public class reverse_string {
    public static void main(String[] args) {
        String s="pruthiraj";
        System.out.println(revese(s,""));
    }

    private static String revese(String s,String p) {
        for (int i = s.length()-1; i >=0 ; i--) {
            p+=s.charAt(i);
        }
        return p;
    }
}
