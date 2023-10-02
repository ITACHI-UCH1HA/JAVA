package Year_2023.M09_September_2023.Date_09_06_2023;
import java.util.*;
public class Three_sum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
//      sorted int nums[]={-4,-1,-1,0,1,2};

        System.out.println(threeSum_chatgpt(nums));
    }

    private static List<List<Integer>> threeSum_chatgpt(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort the input array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet that sums to zero
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list1= twosum(nums,i);
            if(list1.size()==3){
                if(list.contains(list1)) continue;
                list.add(list1);
            }
        }
        return list;
    }
    public static List<Integer> twosum(int[] nums,int k){
        int i=0,j= nums.length-1;
        while(i<j){
            if(i==k){
                i++;
                continue;
            }
            if(j==k){
                j--;
                continue;
            }
            if(nums[i]+nums[j]+nums[k]==0){
                List<Integer> lister=new ArrayList<>();
                lister.add(nums[i]);
                lister.add(nums[j]);
                lister.add(nums[k]);
                return lister;
            }
            else if(nums[i]+nums[j]+nums[k]>0){
                j--;
            }
            else {
                i++;
            }
        }
        return new ArrayList<>();
    }
}
