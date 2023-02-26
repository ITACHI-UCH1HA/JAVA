package Date_02_06_2023;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=study-plan&id=binary-search-i

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters={'c','d','d','e'};
        System.out.println(nextGreatestLetter(letters,'d'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target) return letters[0];
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target) start=mid+1;
            else end=mid-1;
        }
        return letters[start];
    }
}
