package October_2023.Date_01;
import java.util.*;
public class Three_Sum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums); //{-4,-1,-1,0,1,2}
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}
