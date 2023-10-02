package Year_2023.M06_June_2023.Date_06_10_2023;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="sujit";
        String word2="kumar";
        System.out.println(stringmerge(word1,word2));
    }

    private static String stringmerge(String word1, String word2) {
        StringBuilder merged=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i<word1.length()){
            merged.append(word1.charAt(i));
            i++;
        }
        while (j<word2.length()){
            merged.append(word2.charAt(j));
            j++;
        }
        return merged.toString();
    }
}
