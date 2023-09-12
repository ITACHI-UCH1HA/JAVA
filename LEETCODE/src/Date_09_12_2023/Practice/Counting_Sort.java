package Date_09_12_2023.Practice;

import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Nothing to sort
        }

        // Find the maximum value in the array to determine the range
        int max = arr[0];
        for (int num : arr) {
            max=Math.max(max,num);
        }

        // Create a counting array to store the count of each element
        int[] countArray = new int[max + 1];

        // Count the occurrences of each element in the original array
        for (int num : arr) {
            countArray[num]++;
        }

        // Reconstruct the sorted array from the counting array
        int index = 0;
        for (int i = 0; i <=max; i++) {
            while (countArray[i]>0){
                arr[index]=i;
                index++;
                countArray[i]--;
            }
        }
    }
}
