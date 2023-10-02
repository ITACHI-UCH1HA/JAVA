package Year_2023.M06_June_2023.Date_06_10_2023;

import java.util.Arrays;

public class GreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        boolean[] result = kidsWithCandies(candies, extraCandies);

//        for (boolean value : result) {
//            System.out.print(value + " "); // Output: false false true false true
//        }
        System.out.println(Arrays.toString(result));
    }

    private static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=getmax(candies);
        boolean[] ans=new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>maxcandies) ans[i]=true;
        }
        return ans;
    }

    private static int getmax(int[] candies) {
        int max=candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i]>max) max=candies[i];
        }
        return max;
    }

}
