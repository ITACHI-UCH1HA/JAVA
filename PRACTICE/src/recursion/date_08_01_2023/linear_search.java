package recursion.date_08_01_2023;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,9,9,9,9};
        System.out.println(search(arr,9,0));
    }
    static ArrayList<Integer> list=new ArrayList<>();
    private static ArrayList<Integer> search(int[] arr, int target,int index) {
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return search(arr,target,++index);
    }
}
