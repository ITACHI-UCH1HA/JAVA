package recursion.Date_04_06_2023;

public class linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(bsearch(arr,5,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int pointer){
        if(pointer==arr.length) return -1;
        if(arr[pointer]==target) return pointer;
        return search(arr,target,++pointer);
    }
    public static int bsearch(int[] arr,int target,int start,int end){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]<target) return bsearch(arr,target,mid+1,end);
        else return bsearch(arr,target,start,mid-1);
    }
}
