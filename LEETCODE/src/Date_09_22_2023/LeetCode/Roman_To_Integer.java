package Date_09_22_2023.LeetCode;

public class Roman_To_Integer {
    public static void main(String[] args) {
        String s="IX";
        System.out.println(romanToInt(s));
    }

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public static int romanToInt(String s) {
        int num=0;
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]){
                case 'I':
                    if(i!= c.length-1 && (c[i+1]=='V' ||c[i+1]=='X') ){
                        num+=-1;
                    }else{
                        num+=1;
                    }
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    if(i!= c.length-1 && (c[i+1]=='L' ||c[i+1]=='C') ){
                        num+=-10;
                    }else{
                        num+=10;
                    }
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    if(i!= c.length-1 && (c[i+1]=='D' ||c[i+1]=='M') ){
                        num+=-100;
                    }else{
                        num+=100;
                    }
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
        }
        return num;
    }
}
