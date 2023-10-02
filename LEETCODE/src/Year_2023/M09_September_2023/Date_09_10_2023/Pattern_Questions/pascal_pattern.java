package Year_2023.M09_September_2023.Date_09_10_2023.Pattern_Questions;

public class pascal_pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
