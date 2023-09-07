package Dynamic_Programming;

public class Fibbonaci {
    public static void main(String[] args) {
        System.out.println(recur(47));
    }
    private static long recur(int num) {
        if(num<=1) return num;
        return recur(num-2)+recur(num-1);
    }
    public static long fibonacci(int n) {
        long[] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
