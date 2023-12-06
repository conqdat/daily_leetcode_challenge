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


    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int result = 0;

        while(r >= l) {
            if(height[r] >= height[l]) {
                int currentArea = height[l] * (r - l);
                result = Math.max(currentArea, result);
                l++;
            } else {
                int currentArea = height[r] * (r - l);
                result = Math.max(currentArea, result);
                r--;
            }
        }
        return result;
    }



    public static void main(String[] args) {

        int[] height = { 1,8,6,2,5,4,8,3,7 };

        System.out.println( maxArea(height) );

    }
}
