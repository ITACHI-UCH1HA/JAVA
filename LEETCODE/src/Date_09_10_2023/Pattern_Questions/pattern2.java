package Date_09_10_2023.Pattern_Questions;

public class pattern2 {
    public static void main(String[] args) {
        p1(5);
    }
    public static void p1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
