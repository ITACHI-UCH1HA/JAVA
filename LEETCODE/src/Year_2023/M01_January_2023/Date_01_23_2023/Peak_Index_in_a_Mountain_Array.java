package Year_2023.M01_January_2023.Date_01_23_2023;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] arr={3,4,5,1};
        System.out.println(peakIndexInMountainArray2(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) return mid;
            else if (arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid-1;
        }
        return end+1;
    }
    public static int peakIndexInMountainArray2(int[] arr) {
        int start=0,end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid-1;
        }
        return end+1;
    }
}
