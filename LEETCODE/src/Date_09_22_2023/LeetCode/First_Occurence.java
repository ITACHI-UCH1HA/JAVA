package Date_09_22_2023.LeetCode;

public class First_Occurence {
    public static void main(String[] args) {
        String haystack="ssss";
        String needle="sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
