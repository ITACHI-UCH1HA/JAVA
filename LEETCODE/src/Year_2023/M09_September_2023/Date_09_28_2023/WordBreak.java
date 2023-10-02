package Year_2023.M09_September_2023.Date_09_28_2023;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    static TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }

    public static boolean wordBreak(String s) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && search(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEndOfWord;
    }

    public static void main(String[] args) {
        String[] words = { "i", "love", "samsumg", "sam", "ice" };
        String key = "ilovesamsung";
        for (String s : words) {
            insert(s);
        }
        System.out.println(wordBreak(key)); // Output: true
    }
}
