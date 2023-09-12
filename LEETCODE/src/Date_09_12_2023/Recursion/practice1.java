package Date_09_12_2023.Recursion;

public class practice1 {
    public static void main(String[] args) {
        int n=999;
        sum_of_digit_RTL(n);
    }

    private static int sum_of_digit_RTL(int n) {
        if(n<=9){
            System.out.print(n+" ");
            return n;
        }
        int prev=sum_of_digit_LTR(n%10);
        System.out.print(n/10+prev+" ");
        return prev+n/10;
    }

    private static int sum_of_digit_LTR(int n) {
        if(n<=9){
            System.out.print(n+" ");
            return n;
        }
        int prev=sum_of_digit_LTR(n/10);
        System.out.print(n%10+prev+" ");
        return prev+n%10;
    }

    private static int sums(int n) {
        if(n==1){
            System.out.print(1+" ");
            return 1;
        }
        int prev=sums(n-1);
        System.out.print(n+prev+" ");
        return n+prev;
    }

    private static int product(int n) {
        if(n==1){
            System.out.print(1+" ");
            return 1;
        }
        int prev=product(n-1);
        System.out.print(n*prev+" ");
        return n*prev;
    }

    private static int Fibonacci(int n) {
        if(n<0){
            return 0;
        }
        else if(n<3){
            System.out.print(1+" ");
            return 1;
        }
        else{
            int i=Fibonacci(n - 1) + Fibonacci(n - 2);
            System.out.println(i);
            return i;
        }
    }

    private static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    private static void prints_n_to_1(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        prints_1_to_n(n-1);
        System.out.println(n);
    }

    private static void prints_1_to_n(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        prints_1_to_n(n-1);
        System.out.println(n);
    }
}
