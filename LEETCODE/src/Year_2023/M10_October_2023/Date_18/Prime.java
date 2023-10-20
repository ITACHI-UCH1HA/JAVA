package Year_2023.M10_October_2023.Date_18;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
    public static boolean isPrime(int number) {
        if(number==1){
            return false;
        }
        boolean[] primes=new boolean[number];
        for (int i = 2; i*i<=number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
