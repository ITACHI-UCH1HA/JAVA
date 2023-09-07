package Date_07_14_2023;

import java.util.Locale;

public class valid_palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }

    private static boolean isPalindrome2(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j){
            if(is_Alpha_Num(s.charAt(i))==false){
                i++;
                continue;
            }
            else{
                if(is_Alpha_Num(s.charAt(j))==false){
                    j--;
                    continue;
                }
            }
//            System.out.println(s.charAt(i)+" "+s.charAt(j));
            if(is_small(s.charAt(i))==is_small(s.charAt(j))){
//                System.out.println(s.charAt(i)+" "+s.charAt(j));
                i++;
                j--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    private static char is_small(char ch) {
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch - 'A') ;
            return (char)(ch+'a');
        }
        else return ch;
    }

    private static boolean is_Alpha_Num(char c) {
        if((c>='a' && c<='z') ||(c>='A' && c<='Z') ||(c>='0' && c<='9') ) return true;
        return false;
    }
}
