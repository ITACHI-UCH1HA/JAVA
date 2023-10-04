package Year_2023.M10_October_2023.Date_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomeNote="aa";
        String magazine="aab";
        System.out.println(canConstruct(ransomeNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to count character frequencies in magazine
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the charCount HashMap
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                if (count > 1) {
                    charCount.put(c, count - 1);
                } else {
                    charCount.remove(c);
                }
            } else {
                return false; // Character not found in magazine
            }
        }

        return true;
    }
}
