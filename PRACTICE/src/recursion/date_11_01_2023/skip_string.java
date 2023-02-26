package recursion.date_11_01_2023;

public class skip_string {
    public static void main(String[] args) {
        string_skip("","sujitkumar");
    }

    private static String string_skip(String p, String up) {
        return "";
    }

    private static void char_skip(String p, String up, char ch) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        if(c==ch) char_skip(p,up.substring(1),ch);
        else char_skip(p+c,up.substring(1),ch);
    }
}
