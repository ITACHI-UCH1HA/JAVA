package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

public class pattern5 {
    public static void main(String[] args) {
        p2(5);
    }
    public static void p1(int n){
        for (int i = 1; i < 2*n; i++) {
            int j=i>n?2*n-i:i;
            int space=n-j;
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
