package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

//                         1
//                       2 1 2
//                     3 2 1 2 3
//                   4 3 2 1 2 3 4
//                 5 4 3 2 1 2 3 4 5
public class pattern6 {
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
    }
}
