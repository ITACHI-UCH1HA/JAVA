package Year_2023.M01_January_2023.Date_01_11_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1},nums2={2,2};
        System.out.println(Arrays.toString(intersection( nums1,nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]&& !nums.contains(nums1[i])) nums.add(nums1[i]);
            }
        }
        int[] numss=new int[nums.toArray().length];
        for (int i = 0; i < nums.toArray().length; i++) {
            numss[i]= nums.get(i);
        }
        return numss;
    }
}
