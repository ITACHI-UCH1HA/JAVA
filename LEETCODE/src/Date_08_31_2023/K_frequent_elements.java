package Date_08_31_2023;

import java.util.Arrays;

public class K_frequent_elements {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1 ) return new int[]{nums[0]};
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int p=0,q=1,i=0;
        int count=1;
        while (q< nums.length){
            if(nums[p]==nums[q]){
                count++;
                if(count>=k){
                    arr[i]=nums[p];
                    for (int j = q; j <nums.length ; j++) {
                        if(nums[p]==nums[q]) q++;
                    }
                    p=q;
                    q++;
                    i++;
                }
                q++;
            }
            else{
                p=q;
                q++;
            }
        }
        return arr;
    }
}
