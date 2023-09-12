package Date_09_12_2023.Practice;

public class Quick_Select {
    public static int quickSelect(int[] nums,int k){
        return quickSelect(nums,0,nums.length-1,k);
    }
    public static void main(String[] args) {
        Quick_Select quickSelect = new Quick_Select();
        int[] nums = {3, 2, 1, 5, 6, 4};
//      int[] nums=  {1, 2, 3, 4, 5, 6};
        int k = 2;
        int kthSmallest = quickSelect.quickSelect(nums, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
    public static int quickSelect(int[] nums,int l,int h,int k){
        int s=l;
        int e=h;
        int mid=l+(h-l)/2;
        while(l<=h){

        }
        return 1;
    }
}
