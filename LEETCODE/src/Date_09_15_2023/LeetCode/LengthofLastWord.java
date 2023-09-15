package Date_09_15_2023.LeetCode;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "  fly me   to   the moon  ";
        System.out.println(lengthOfLastWord_II(s));
    }

    private static int lengthOfLastWord_II(String s) {
//        s.trim() function is used to remove the trailing and leading spaces from the given String
        s.trim();
//        s.split() function divides the
        String[] ans=s.split(" ");
        if(ans.length==0) return 0;
        return ans[ans.length-1].length();
    }

    public static int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        int spaces=0;
        int length=0;
        for (int i = s.length()-1 ; i >=0 ; i--) {
            if(s.charAt(i)==' '){
                spaces++;
            }else{
                break;
            }
        }
        for (int i = s.length()-spaces-1; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                length++;
            }else{
                break;
            }
        }
        return length;
    }
}
