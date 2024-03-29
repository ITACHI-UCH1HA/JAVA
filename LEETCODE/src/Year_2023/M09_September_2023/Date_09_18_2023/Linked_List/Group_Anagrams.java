package Year_2023.M09_September_2023.Date_09_18_2023.Linked_List;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams_I(strs));
    }
    public static List<List<String>> groupAnagrams_I(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs) {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
