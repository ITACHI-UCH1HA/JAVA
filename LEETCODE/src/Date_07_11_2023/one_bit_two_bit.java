package Date_07_11_2023;

public class one_bit_two_bit {
    public static void main(String[] args) {
        int[] bits={1,1,0};
        isOneBitCharacter(bits);
    }

    private static boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1]==0 && bits.length%2!=0) return true;
        return false;
    }
}
