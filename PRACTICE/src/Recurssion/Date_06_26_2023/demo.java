package Recurssion.Date_06_26_2023;
//print form 100 to 1
public class demo {
    public static void main(String[] args) {
        System.out.println(logpowered(2,10));
    }

    private static boolean logpowered(int num, int log) {
        int logged=powered(2,)
    }

    private static int powered(int base, int exponent) {
        if(exponent==0 || (exponent==0&&base==0)) return 1;
        if(base==0) return 0;
//        if(exponent==1) return base;
        return base*powered(base,exponent-1);
    }

    private static int fibonacci10(int num) {
        if(num<=1) return num;
        System.out.println(num-1);
        System.out.println(num-2);
        return fibonacci10(num-1)+fibonacci10(num-2);
    }

    private static int fact100(int num) {
        if(num==1) return 1;
        return num*fact100(num-1);
    }

    private static int sum100(int num) {
        if(num==1) {
            return 1;
        }
        return num+sum100(num-1);
    }

    private static void for100(int num) {
        if(num>1) for100(num-1);
        System.out.println(num);
    }

    private static void rev100(int num) {
        if(num==0) return;
        System.out.println(num);
        rev100(num-1);
    }
}
