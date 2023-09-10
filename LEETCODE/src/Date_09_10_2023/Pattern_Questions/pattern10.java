package Date_09_10_2023.Pattern_Questions;

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

public class pattern10 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        for (int i = 1; i <2*n; i++) {
            for (int j = i; j <= 2*n-i; j++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
