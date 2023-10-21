package Year_2023.M10_October_2023.Date_21;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for (int num:nums) {
            int n= list.size();
            for (int i = 0; i < n; i++) {
                List<Integer> ans=new ArrayList<>(list.get(i));
                ans.add(num);
                list.add(ans);
            }
        }
        return list;
    }
}
