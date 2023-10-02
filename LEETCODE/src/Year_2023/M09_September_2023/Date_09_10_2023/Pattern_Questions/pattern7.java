package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

//        ****
//        *  *
//        *  *
//        *  *
//        ****
public class pattern7 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || j==n-1 || i==0 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
