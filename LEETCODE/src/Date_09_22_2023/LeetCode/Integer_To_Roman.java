package Date_09_22_2023.LeetCode;

public class Integer_To_Roman {
    public static void main(String[] args) {
        int num=58;
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        String s="";
        while(num!=0){
            int rem=num%10;
            num/=10;
        }
        return s;
    }
    public static int Last_digit(int num){
        return 1;
    }
}
