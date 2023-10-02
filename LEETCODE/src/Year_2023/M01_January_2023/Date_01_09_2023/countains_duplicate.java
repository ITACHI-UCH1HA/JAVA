//https://leetcode.com/problems/contains-duplicate/

package Year_2023.M01_January_2023.Date_01_09_2023;

import java.util.HashSet;

public class countains_duplicate {
    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1,2,2,3,4,5,6}));
    }

    private static boolean duplicate(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
