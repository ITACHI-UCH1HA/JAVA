package Date_09_13_2023.Recurssion;

public class Remove_character {
    public static void main(String[] args) {
        String s="baccad";
        System.out.println(removed_char(s,""));
    }

    private static String removed_char(String s,String ans) {
        if(s.isEmpty()){
            return ans;
        }
        if(s.charAt(0)=='a'){
            return removed_char(s.substring(1),ans);
        }
        else{
            return removed_char(s.substring(1),ans+s.charAt(0));
        }
    }
}
