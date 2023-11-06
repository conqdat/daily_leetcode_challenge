import java.util.Arrays;

class Solution {

    public static int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i = 0; i < result.length; i++) {
            result[i] = sumOfNum( Integer.bitCount(i) );
        }
        System.out.println( Arrays.toString(result) );
        return result;
    }
    

    public static int sumOfNum(int n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n = n / 10;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println( countBits(n) );

    }
}