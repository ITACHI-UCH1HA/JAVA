package Date_02_06_2023;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/?envType=study-plan&id=binary-search-i
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr){
        if(arr.length==3) return 1;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        if(arr[(arr.length-1)/2]>arr[(arr.length)/2-1] && arr[(arr.length-1)/2]>arr[(arr.length)/2+1]) return arr.length/2;
        int start=0,end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid;
        }
        return start;
    }
}
