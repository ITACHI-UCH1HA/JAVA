package Year_2023.M10_October_2023.Date_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class valid_Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram_4(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char sArr[]=s.toCharArray();
        char tArr[]=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);
    }
    public static boolean isAnagram_2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sCount=new HashMap<>();
        for (char c:s.toCharArray()) {
            sCount.put(c,sCount.getOrDefault(c,0)+1);
        }
        for (char c:t.toCharArray()) {
            sCount.put(c,sCount.getOrDefault(c,0)-1);
        }
        for (int val:sCount.values()) {
            if(val!=0){
                return false;
            }
        }
        return true;
    }
    private static boolean isAnagram_3(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] vals=new int[26];
        for (char c:s.toCharArray()) {
            vals[c-'a']++;
        }
        for (char c:t.toCharArray()) {
            vals[c-'a']--;
        }
        for (int val:vals) {
            if(val!=0){
                return false;
            }
        }
        return true;
    }
    private static boolean isAnagram_4(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        LinkedList<Character> sLink=new LinkedList<>();
        LinkedList<Character> tLink=new LinkedList<>();
        for (char c:s.toCharArray()) {
            sLink.add(c);
        }
        for (char c:t.toCharArray()) {
            tLink.add(c);
        }
        while(!sLink.isEmpty()){
            char c=sLink.getFirst();
            if(tLink.removeFirstOccurrence(c)){
                sLink.removeFirst();
            }else{
                return false;
            }
        }
        return true;
    }
}
