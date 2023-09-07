package Date_08_30_2023;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Two_Sum_2 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int l=i+1,h=numbers.length-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(numbers[i]+numbers[mid]==target) return new int[]{i+1,mid+1};
                else if(numbers[i]+numbers[mid]>target) h=mid-1;
                else l=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,4,9,56,90};
        System.out.println(Arrays.toString(hashmap_Method(numbers,8)));
    }

    private static int[] hashmap_Method(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:numbers) {
            if(map.containsKey(target-numbers[i])) return new int[]{map.get(target-numbers[i]),i+1};
            map.put(numbers[i],i+1);
        }
        return new int[]{};
    }

    private static int[] twoSum_M2(int[] numbers, int target) {
        int p=0;
        int q=numbers.length-1;
        while (p<q){
            if(numbers[p]+numbers[q]==target) return new int[]{p+1,q+1};
            else if (numbers[p]+numbers[q]<target) p++;
            else q--;
        }
        return new int[]{-1,-1};
    }
}
