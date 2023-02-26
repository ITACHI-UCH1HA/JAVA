package GreedyAlgorithms;

import java.util.Arrays;

public class knapsack {
    static class Item{
        int value;
        int weight;
        Item(int x,int y){
            this.value=x;
            this.weight=y;
        }
    }
//    values[] = {60,100,120}
//    weight[] = {10,20,30}
    public static void main(String[] args) {
        Item[] arr={new Item(60,10),new Item(100,20),new Item(120,30)};
        System.out.println(fractionalKnapsack(50,arr,3));
    }

    private static double fractionalKnapsack(int W, Item[] arr, int n) {
        // Compute the value-to-weight ratios for all items and store them in a new array.
        double[] ratios = new double[n];
        for (int i = 0; i < n; i++) {
            ratios[i] = (double) arr[i].value / arr[i].weight;
        }

        // Sort the items by their value-to-weight ratio in descending order.
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ratios[j] > ratios[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the items at indices i and maxIndex.
            double tempRatio = ratios[i];
            ratios[i] = ratios[maxIndex];
            ratios[maxIndex] = tempRatio;
            Item tempItem = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = tempItem;
        }

        // Select items one by one until the knapsack is full.
        double totalValue = 0.0;
        int weightSoFar = 0;
        for (int i = 0; i < n; i++) {
            if (weightSoFar + arr[i].weight <= W) {
                // If the entire item fits in the knapsack, add its value to the total value.
                totalValue += arr[i].value;
                weightSoFar += arr[i].weight;
            } else {
                // Otherwise, add a fraction of the item to the knapsack.
                double fraction = (double) (W - weightSoFar) / arr[i].weight;
                totalValue += fraction * arr[i].value;
                break;
            }
        }
        return totalValue;
    }
}
