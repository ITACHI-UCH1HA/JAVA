package Date_09_21_2023.NeetCode;

import java.util.Arrays;

public class CountingBits{
    public static void main(String[] args) {
        int n=20;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        for (int i = 0; i <=n; i++) {
            int sum=0;
            int bits=i;
            while(bits!=0){
                sum+=bits&1;
                bits>>>=1;
            }
            ans[i]=sum;
        }
        return ans;
    }
    private static int[] countBits_II(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // To calculate the number of 1's in i, use the result for i / 2 and add the least significant bit.
            ans[i] = ans[i / 2] + (i % 2);
        }

        return ans;
    }
}
