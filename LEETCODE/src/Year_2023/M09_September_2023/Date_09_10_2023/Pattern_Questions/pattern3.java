package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

public class pattern3 {
    public static void main(String[] args) {
        p1_method2(5);
    }

    private static void p1_method2(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            int k=i>n-1?2*n-i-1:i;
            for (int j = 0; j <k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1; j<=i  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
