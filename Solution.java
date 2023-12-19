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

    public static void main(String[] args) {
        int n = 25;

        System.out.println( tribonacci(n) );




    }
}
