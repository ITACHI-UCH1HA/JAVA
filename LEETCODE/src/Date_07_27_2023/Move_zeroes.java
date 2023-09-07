package Date_07_27_2023;

import java.util.Arrays;

public class Move_zeroes {
    public static void main(String[] args) {
        int[] nums={4,2,4,0,0,3,0,5,1,0};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes2(int[] nums) {
        int i=0,j=0;
        while(j< nums.length){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length!=1){
            //here the i tracks the zeroes while j tracks the non zero ones
            int i=0,j;
            while(i< nums.length && nums[i]!=0){
                i++;
            }
            j=i+1;
            while(j<nums.length){
                //update the pointer until a zero is assigned to nums[i]
                while(i< nums.length && nums[i]!=0){
                    i++;
                }
                //update the pointer until a non zero number is assigned to nums[j]
                while(j<nums.length && nums[j]==0){
                    j++;
                }

                //swap the zero and the non zero integer
                if(j< nums.length && i< nums.length){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                //update the position of the pointers
                i++;
                j++;
            }
        }
    }
}
