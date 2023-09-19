package Date_09_18_2023.NeetCode.Linked_List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,2,2,3,3,3,3,3};
        System.out.println(Arrays.toString(topKFrequent_II(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
//        for (int n:nums) {
//            if(map.containsKey(n)){
//                map.put(n,map.get(n)+1);
//            }else{
//                map.put(n,1);
//            }
//        }
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int[] ans=new int[k];
        for (int i = 0; i < ans.length; i++) {
            int max=Integer.MIN_VALUE;
            int maxkey=0;
            for (int j: map.keySet()) {
                if(map.get(j)>max){
                    maxkey=j;
                    max=map.get(maxkey);
                }
            }
            ans[i]=maxkey;
            map.remove(maxkey);
        }
        return ans;
    }
    private static int[] topKFrequent_II(int[] nums, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Use a Min Heap (PriorityQueue) to keep track of the top k frequent elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));

        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element if the heap size exceeds k
            }
        }

        // Populate the result array with the top k frequent elements
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
