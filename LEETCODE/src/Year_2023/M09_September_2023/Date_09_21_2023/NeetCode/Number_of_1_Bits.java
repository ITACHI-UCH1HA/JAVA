package Year_2023.M09_September_2023.Date_09_21_2023.NeetCode;

public class Number_of_1_Bits {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int sum=0;
        while(n!=0){
            sum+=n&1;
            n>>>=1;
        }
        return sum;
    }
}
