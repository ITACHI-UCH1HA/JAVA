package Date_09_10_2023.Pattern_Questions;

public class pattern1 {
    public static void main(String[] args) {
        p3(5);
    }

    private static void p3(int n) {
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j<=i  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void p2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
