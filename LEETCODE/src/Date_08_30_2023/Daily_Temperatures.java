package Date_08_30_2023;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int curr=temperatures[i];
            while(curr>temperatures[i]){
            }
        }
        return temperatures;
    }
    public static void main(String[] args) {
        int[] temparatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temparatures)));
    }
}
