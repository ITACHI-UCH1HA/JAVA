package Date_09_22_2023.LeetCode;

public class Reverse_Words_In_String {
    public static void main(String[] args) {
        String s="  hello                world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        for (int i = arr.length-1; i >0; i--) {
            ans.append(arr[i]+" ");
        }
        ans.append(arr[0]);
        return ans.toString();
    }
}
