package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

public class pattern4 {
    public static void main(String[] args) {
        p1(5);
    }

    public static void p1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = i-1; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
