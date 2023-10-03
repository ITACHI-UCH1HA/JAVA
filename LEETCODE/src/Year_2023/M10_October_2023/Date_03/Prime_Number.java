package Year_2023.M10_October_2023.Date_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime_Number {
//[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
    public static void main(String[] args) {
        int num=100;
        System.out.println(Arrays.toString(seive_PrimesInRange(1,100)));
    }

    private static int[] seive_PrimesInRange(int a, int b) {
        boolean[] isPrime = new boolean[b + 1];
        List<Integer> primes = new ArrayList<>();

        // Initialize the boolean array
        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= b; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= b; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collect the prime numbers in the given range
        for (int i = Math.max(2, a); i <= b; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int[] ans2 = primes.stream().mapToInt(Integer::intValue).toArray();
        return ans2;

    }

    private static int[] PrimesInRange(int a,int b) {//brute Force
        List<Integer> primes=new ArrayList<>();
        for (int i = a; i <= b; i++) {
            for (int j = 2; j<=i; j++) {
                if(j==i){
                    primes.add(i);
                    break;
                }
                if(i%j==0){
                    break;
                }
            }
        }
        int[] ans2=primes.stream().mapToInt(Integer::intValue).toArray();
        return ans2;
    }

    private static int[] uptoPrime(int num) {
        List<Integer> primes=new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for (int i = 4; i <= num; i++) {
            for (int j = 2; j <=i; j++) {
                if(j==i){
                    primes.add(i);
                    break;
                }
                if(i%j==0){
                    break;
                }
            }
        }
        int[] ans2=primes.stream().mapToInt(Integer::intValue).toArray();
        return ans2;
    }

    private static boolean isPrime(int num) {//brute Force method
        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
