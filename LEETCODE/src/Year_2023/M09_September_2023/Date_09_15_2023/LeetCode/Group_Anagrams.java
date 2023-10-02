package Year_2023.M09_September_2023.Date_09_15_2023.LeetCode;
import java.util.*;
public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams_II(strs));
    }

    private static List<List<String>> groupAnagrams_II(String[] strs) {
        // Create a map to store anagrams as keys and their corresponding lists as values
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Count the frequency of each character in the string
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Convert the character count array to a unique key for anagrams
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count);
                keyBuilder.append('#');
            }
            String key = keyBuilder.toString();

            // If the key is not in the map, create a new entry
            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }

            // Add the original string to the corresponding list in the map
            anagramMap.get(key).add(str);
        }

        // Create a list to store the final result
        List<List<String>> result = new ArrayList<>(anagramMap.values());
        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store anagrams as keys and their corresponding lists as values
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);

            // Convert the sorted char array back to a string to use it as a key
            String sortedStr = new String(strArray);

            // If the sorted string is not in the map, create a new entry
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }

            // Add the original string to the corresponding list in the map
            anagramMap.get(sortedStr).add(str);
        }

        // Create a list to store the final result
        List<List<String>> result = new ArrayList<>(anagramMap.values());

        return result;
    }
}
