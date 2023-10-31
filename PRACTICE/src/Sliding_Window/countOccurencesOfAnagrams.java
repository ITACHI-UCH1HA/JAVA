package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class countOccurencesOfAnagrams {
    public static void main(String[] args) {
        String pat="for";
        String txt="forxxorfxdofr";
        System.out.println(search(pat,txt));
    }
    public static int search(String pat, String txt) {
        int count=0,k=pat.length(),n=txt.length();
        char[] pats=pat.toCharArray();
        char[] txts=txt.toCharArray();
        Arrays.sort(pats);

        List<Character> anag=new ArrayList<>();

        for (int i = 0; i < k; i++) {
            anag.add(txts[i]);
        }

        Collections.sort(anag);

        if(Arrays.equals(pats,txts)){
            count++;
        }
        for (int i = k; i < n; i++) {
            
        }
        return count;
    }
}
