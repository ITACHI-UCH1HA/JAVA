package recursion.date_08_01_2023;

public class palindrome {
    public static void main(String[] args) {
//        System.out.println(palindrome_2(12321));
    }

//    private static boolean palindrome_2(int num) {
//    }

    private static boolean palindrome_or_not(int num) {
        return num==reverse(num);
    }
    static int sum=0;
    private static int reverse(int num) {
        if(num==0) return sum;
        sum=sum*10+(num%10);
        reverse(num/10);
        return sum;
    }
}
