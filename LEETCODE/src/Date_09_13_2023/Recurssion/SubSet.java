package Date_09_13_2023.Recurssion;
import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(sub_sets("",s));
    }

    private static void sub_set(String p,String s) {
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=s.charAt(0);
        sub_set(p+c,s.substring(1));
        sub_set(p,s.substring(1));
    }
    private static ArrayList<String> sub_sets(String p, String s) {
        if(s.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char c=s.charAt(0);
        ArrayList<String> left=sub_sets(p+c,s.substring(1));
        ArrayList<String> right=sub_sets(p,s.substring(1));
        left.addAll(right);
        return left;
    }
}
