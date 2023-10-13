package Year_2023.M10_October_2023.Date_13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Boy_Or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        Set<Character> set=new HashSet<>();
        for (char c:s.toCharArray()) {
            set.add(c);
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println( "IGNORE HIM!" );
        }
    }
}
