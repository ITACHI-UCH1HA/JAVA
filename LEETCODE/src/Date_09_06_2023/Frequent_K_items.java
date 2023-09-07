package Date_09_06_2023;
import java.util.*;
public class Frequent_K_items {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequent(nums,k));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for (int i:nums) {
            if(table.containsKey(i)){
                int count=table.get(i)+1;
                table.put(i,count);
            }
            table.put(i,1);
        }
        return new int[]{};
    }
}
