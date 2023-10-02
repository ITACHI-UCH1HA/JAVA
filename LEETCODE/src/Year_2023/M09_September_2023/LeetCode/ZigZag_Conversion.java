package Year_2023.M09_September_2023.LeetCode;

public class ZigZag_Conversion {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
    public static String convert(String s, int numRows) {
        if(numRows==0 || numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i]=new StringBuilder();
        }
        int currRow=0;
        boolean goingDown=false;
        for (char c:s.toCharArray()) {
            rows[currRow].append(c);
            if(currRow==0 || currRow==numRows-1){
                goingDown=!goingDown;
            }
            currRow+=goingDown?1:-1;
        }

        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(rows[i]);
        }
        return ans.toString();//PAHNAPLSIIGYIR
    }
}
