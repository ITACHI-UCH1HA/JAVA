package Year_2023.M10_October_2023.Date_18;

public class main {
    public static void main(String[] args) {
        double[] arr={4, 7, 2, 8, 10, 9};
        System.out.println(maxValue(arr));
    }
    public static double maxValue(double[] numbers) {
        double max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            max=Math.max(max,numbers[i]);
        }
        return max;
    }
}
