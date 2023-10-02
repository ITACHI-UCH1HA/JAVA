package Year_2023.M09_September_2023.Date_09_13_2023.Recurssion;

import java.util.ArrayList;

public class Print_ASCII {
    public static void main(String[] args) {
        System.out.println(sub_sets("","abc"));
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
        ArrayList<String> ascii=sub_sets(p+" "+(c+0),s.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
