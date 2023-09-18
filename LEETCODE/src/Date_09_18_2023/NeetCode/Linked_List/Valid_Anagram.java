package Date_09_18_2023.NeetCode.Linked_List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram_IV(s,t));
    }

    public static boolean isAnagram_I(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        return Arrays.equals(S,T);
    }
    public static boolean isAnagram_II(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] ans=new int[26];
        for (char c:s.toCharArray()) {
            ans[c-'a']++;
        }
        for (char c:t.toCharArray()) {
            ans[c-'a']--;
        }
        for (int i:ans) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    private static boolean isAnagram_III(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> S= new HashMap<>();
        Map<Character,Integer> T= new HashMap<>();
        for (char c:s.toCharArray()) {
            S.put(c, S.getOrDefault(c,0)+1);
        }
        for (char c:t.toCharArray()) {
            T.put(c, T.getOrDefault(c,0)+1);
        }
        return S.equals(T);
    }
    private static boolean isAnagram_IV(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create linked lists to represent characters in strings s and t
        LinkedList<Character> listS = new LinkedList<>();
        LinkedList<Character> listT = new LinkedList<>();

        // Populate the linked list for string s
        for (char c : s.toCharArray()) {
            listS.add(c);
        }

        // Populate the linked list for string t
        for (char c : t.toCharArray()) {
            listT.add(c);
        }

        // Compare the linked lists
        while (!listS.isEmpty()) {
            char c = listS.getFirst();
            if (listT.removeFirstOccurrence(c)) {
                listS.removeFirst();
            } else {
                return false; // Character not found in t
            }
        }

        return true; // If both linked lists are empty, they are anagrams
    }
}
