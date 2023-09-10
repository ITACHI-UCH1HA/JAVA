package Date_09_10_2023.Pattern_Questions;

public class pattern9 {
    public static void main(String[] args) {
        p1(5);
    }
    public static void p1(int n){
        for (int i = 1; i <= n; i++) {
//            spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
//           backward nums
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
//           forward nums
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
//            spaces
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
//           backward nums
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
//           forward nums
            for (int j = 2; j <=n-i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
