package Year_2023.M09_September_2023.Date_09_29_2023;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String cleanedString=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left=0;
        int right=cleanedString.length()-1;
        while(left<right){
            if(cleanedString.charAt(left)!=cleanedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
