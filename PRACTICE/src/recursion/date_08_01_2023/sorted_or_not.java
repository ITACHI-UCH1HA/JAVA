package recursion.date_08_01_2023;

public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,8};
        System.out.println(sort(arr,0));
    }

    private static boolean sort(int[] arr,int count) {
        if(count==arr.length-1) return true;
        return arr[count]<arr[count+1]&&sort(arr,count+1);
    }
}
