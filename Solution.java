import java.util.*;

class Solution {

    public static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int tribonacci(int n) {
        int[] f = new int[n+1];
        
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for(int i = 3; i <= n; i ++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }
        return f[n];
    }


    public static int climbStairs(int n) {
        int[] result = new int[n + 1];

        // Edge case
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 3;

        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;

        for(int i = 4; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println( climbStairs(n) );

    }
}
