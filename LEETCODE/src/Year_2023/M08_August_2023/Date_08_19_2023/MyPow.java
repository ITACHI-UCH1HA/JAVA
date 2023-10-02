package Year_2023.M08_August_2023.Date_08_19_2023;

public class MyPow {
    public static void main(String[] args) {
        System.out.println(x_power_n(2,5));
    }

    private static double x_power_n(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        double currentProduct = x;

        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }

        return result;
    }
}
