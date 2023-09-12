package Date_09_12_2023.LeetCode;

public class Add_Binary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a, String b) {
        int carry=0;
        String ans="";
        int p1=a.length()-1;
        int p2=b.length()-1;
        while (p1>=0 && p2>=0){
            if(a.charAt(p1)=='0' && b.charAt(p2)=='0'){
               if(carry==0){
                   ans='0'+ans;
               }else{
                   ans='1'+ans;
                   carry=0;
               }
            }else if((a.charAt(p1)=='1' && b.charAt(p2)=='0') || (a.charAt(p1)=='0' && b.charAt(p2)=='1')){
                if(carry==0){
                    ans='1'+ans;
                }else{
                    ans='0'+ans;
                    carry=1;
                }
            }else{
                if(carry==0){
                    ans='0'+ans;
                }else{
                    ans='1'+ans;
                }
                carry=1;
            }
            p1--;
            p2--;
        }
//        if((a.charAt(i)=='0' && b.charAt(j)))
        if(carry==1){
            ans='1'+ans;
        }
        return ans;
    }
}
