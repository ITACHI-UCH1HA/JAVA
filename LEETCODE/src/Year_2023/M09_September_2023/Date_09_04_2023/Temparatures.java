package Year_2023.M09_September_2023.Date_09_04_2023;

import java.util.*;

public class Temparatures {
    public static void main(String[] args) {
        int[] temparatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(brute2(temparatures)));
    }

    private static int[] brute2(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    count = j - i;
                    break;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // Monotonic decreasing stack to store indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int j = stack.pop();
                result[j] = i - j;
            }
            stack.push(i);
        }

        return result;
    }

    private static int[] brute(int[] temparatures) {
        for (int i = 0; i < temparatures.length; i++) {
            int count=0;
            for (int j = i+1; j < temparatures.length; j++) {
                if(temparatures[j]<=temparatures[i]){
                    count++;
                }else{
                    count++;
                    temparatures[i]=count;
                    break;
                }
                if(j== temparatures.length-1 && temparatures[j]<=temparatures[i]){
                    temparatures[i]=0;
                }
            }
        }
        temparatures[temparatures.length-1]=0;
        return temparatures;
//        expected answer:[1,1,4,2,1,1,0,0]
    }
}
