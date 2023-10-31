package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxOfSubArr_K {
    public static void main(String[] args) {
        int[] arr={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(maximumSumSubarray(2,list,4));
    }

    private static int printKmax(int[] arr,int k) {
        int maxSum=0;
        for (int i = 0; i < k; i++) {
            maxSum+=arr[i];
        }
        int localMax=maxSum;
        for (int i = k; i < arr.length; i++) {
            localMax=localMax-arr[i-k]+arr[i];
            maxSum=Math.max(localMax,maxSum);
        }
        return maxSum;
    }
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        long maxSum=0;
        for (int i = 0; i < K; i++) {
            maxSum+=Arr.get(i);
        }
        long localMax=maxSum;
        for (int i = K; i < Arr.size(); i++) {
            localMax=localMax-Arr.get(i-K)+Arr.get(i);
            maxSum=Math.max(localMax,maxSum);
        }
        return maxSum;
    }
}
