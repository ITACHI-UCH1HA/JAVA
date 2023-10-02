package Year_2023.M07_July_2023.Date_07_17_2023;

//https://leetcode.com/problems/reverse-integer/

public class Reverse_integer {
    public static void main(String[] args) {
        System.out.println(Reverse(-56454));
    }

    private static int Reverse(int x) {
        if(x<0){
            x=0-x;
            int sum=0;
            while(x>0){
                int rem=x%10;
                sum=rem+sum*10;
                x/=10;
            }
            return 0-sum;
        }
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum=rem+sum*10;
            x/=10;
        }
        return sum;
    }
}
