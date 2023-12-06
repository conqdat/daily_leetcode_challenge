import java.util.*;

class Solution {


    public static int totalMoney(int n) {
        if(n < 7) {
            int result = 0;
            for(int i = 1; i <= n; i++) {
                result += i;
            }
            return result;
        }
        int a = (n / 7);
        int r = n % 7;
        int result = 0;
        int i = a;

        while(i > 0) {
            result += 28 + (i - 1) * 7;
            i--;
        }
        for(int j = 0; j < r; j++) {
            int c = a + j + 1;
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;


        System.out.println( totalMoney(n) );

    }
}
