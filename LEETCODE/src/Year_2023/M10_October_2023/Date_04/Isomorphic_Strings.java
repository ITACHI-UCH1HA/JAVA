package Year_2023.M10_October_2023.Date_04;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s="egg";
        String t="agg";
        System.out.println(isIsomorphic_2(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sCount=new HashMap<>();
        HashMap<Character,Character> stConnect=new HashMap<>();
        for (char c:s.toCharArray()) {
            sCount.put(c,sCount.getOrDefault(c,0)+1);
        }
        for (char c:sCount.keySet()) {
            stConnect.put(c,c);
        }
        return true;
    }
    private static boolean isIsomorphic_2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> sTotMap=new HashMap<>();
        HashMap<Character,Character> tTosMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);

            if(sTotMap.containsKey(sChar)){
                if(sTotMap.get(sChar)!=tChar){
                    return false;
                }
            }else{
                sTotMap.put(sChar,tChar);
            }

            if(tTosMap.containsKey(tChar)){
                if(tTosMap.get(tChar)!=sChar){
                    return false;
                }
            }else{
                tTosMap.put(tChar,sChar);
            }
        }
        return true;
    }
}
