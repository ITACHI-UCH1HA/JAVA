package Date_09_16_2023.NeetCode.Arrays_ans_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram_II(s,t));
    }

    private static boolean isAnagram_II(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        int i=0;
        while(i<S.length){
            if(S[i]!=T[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isAnagram_I(String s, String t) {
        // If the lengths of the two strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in string s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check characters in string t and decrement counts from the map
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Character in t doesn't exist in s
            }

            int count = charCount.get(c);
            if (count == 1) {
                charCount.remove(c); // Remove if count reaches 1 to maintain efficiency
            } else {
                charCount.put(c, count - 1);
            }
        }

        // If all characters have been accounted for, the strings are anagrams
        return charCount.isEmpty();
    }
}
