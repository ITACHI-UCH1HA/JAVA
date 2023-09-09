package Date_09_09_2023;

public class Large_factorial {
    public static void main(String[] args) {
        int n = 1000; // Change this to the desired number
        String result = solve(n);
        System.out.println("Factorial of " + n + " is:\n" + result);
    }
    public static String solve(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int[] result = new int[1000]; // Initialize an array to store the result
        result[0] = 1; // Initialize result as 1
        int resultSize = 1; // Size of the result

        for (int i = 2; i <= n; i++) {
            resultSize = multiply(i, result, resultSize); // Multiply by i
        }

        // Convert the result to a String
        StringBuilder sb = new StringBuilder();
        for (int i = resultSize - 1; i >= 0; i--) {
            sb.append(result[i]);
        }

        return sb.toString();
    }
    public static int multiply(int x, int[] result, int resultSize) {
        int carry = 0; // Initialize carry

        // Multiply each element of result with x
        for (int i = 0; i < resultSize; i++) {
            int product = result[i] * x + carry;
            result[i] = product % 10; // Store the last digit
            carry = product / 10; // Carry over the rest
        }

        // Add carry to the result
        while (carry > 0) {
            result[resultSize] = carry % 10;
            carry = carry / 10;
            resultSize++;
        }

        return resultSize;
    }
}
