package Year_2023.M06_June_2023.Date_06_10_2023;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  how   are you?  ";

        String reversedWords = reverseWords(s);
        System.out.println(reversedWords);
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().split("");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
