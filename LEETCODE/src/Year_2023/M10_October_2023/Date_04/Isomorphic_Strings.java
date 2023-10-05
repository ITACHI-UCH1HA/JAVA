package Year_2023.M10_October_2023.Date_04;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Character> stConnect = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if there's a mapping for sChar in stConnect
            if (stConnect.containsKey(sChar)) {
                if (stConnect.get(sChar) != tChar) {
                    return false; // Mismatch found
                }
            } else {
                stConnect.put(sChar, tChar); // Create a mapping from sChar to tChar
            }

            // Check if sChar occurs the same number of times in both s and t
            sCount.put(sChar, sCount.getOrDefault(sChar, 0) + 1);
        }

        // Ensure that no character in s maps to the same character in t more than once
        for (char c : sCount.keySet()) {
            if (sCount.get(c) > 1) {
                return false; // Mismatch found
            }
        }

        return true; // No mismatches found
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
