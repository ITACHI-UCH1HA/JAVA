package Year_2023.M09_September_2023.Date_09_06_2023;
import java.util.*;
public class K_frequent_elements {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for (int i:nums) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            map.put(i,1);
        }

        for (int e:map.keySet()) {
            if(map.get(e)>k){
                list.add(e);
            }
        }
        int[] ans=new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]= list.get(i);
        }
        return ans;
    }
}
