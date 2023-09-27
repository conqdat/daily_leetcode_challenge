import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countZero = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                countZero++;
            }
        }
        if(n == 1 && countZero - n >= 2) return true; 
        if(countZero / 2 >= n && countZero % n != 0) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = { 1,0,0,0,1};
        int n = 1;

        System.out.println( canPlaceFlowers(flowerbed, n) );
    }
}
