package Dynamic_Programming;

import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,6,5,8,7};
        System.out.println(Arrays.toString(Sorted(arr)));
    }

    private static int[] Sorted(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if(arr[i]<arr[j]){
                }
            }
        }
        return new int[]{-1,1};
    }
}
