package Year_2023.M10_October_2023.Date_17;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {

        if(s==null || s.length()==0){
            return 0;
        }

        Map<Character,Integer> map=new HashMap<>();

        for (char c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int length=0;
        boolean oddCount=false;
        for (int count: map.values()) {
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                oddCount=true;
            }
        }
        if(oddCount){
            length++;
        }
        return length;
    }
}
