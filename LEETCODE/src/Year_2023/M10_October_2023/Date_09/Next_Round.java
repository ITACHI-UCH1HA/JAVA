package Year_2023.Month_10.Date_09;
import java.util.Scanner;
public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of participants
        int k = sc.nextInt(); // Position of the k-th participant

        sc.nextLine();

        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] >= score[k - 1] && score[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
