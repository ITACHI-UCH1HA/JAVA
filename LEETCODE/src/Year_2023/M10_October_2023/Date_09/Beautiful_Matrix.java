package Year_2023.Month_10.Date_09;
import java.util.Arrays;
import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix=new int[5][5];

        int k=0,l=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    k=i;
                    l=j;
                }
            }
            sc.nextLine();
        }

        int ans=Math.abs(2-k)+Math.abs(2-l);
        System.out.println(ans);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        System.out.println(k+" "+l);
    }
}
