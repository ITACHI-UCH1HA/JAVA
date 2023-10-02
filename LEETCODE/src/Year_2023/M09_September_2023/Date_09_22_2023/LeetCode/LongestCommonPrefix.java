package Year_2023.M09_September_2023.Date_09_22_2023.LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","banda","bia"};
        System.out.println(longestCommonPrefix_II(strs));
    }

    private static String longestCommonPrefix_II(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String common=strs[0];
        for (int i = 0; i < strs.length; i++) {
            int j=0;
            while(j<common.length() && j<strs[i].length() && common.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            common=common.substring(0,j);
            if(common==""){
                return common;
            }
        }
        return common;
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String common=strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(common.equals(strs[i])){
                continue;
            }
            common=findCommon(common,strs[i]);
        }
        return common;
    }

    private static String findCommon(String common, String str) {
        String s="";
        int i=0;
        while(i<common.length() && i<str.length()){
            if(common.charAt(i)==str.charAt(i)){
                s+=common.charAt(i);
                i++;
            }else{
                break;
            }
        }
        return s;
    }
}
