import java.util.*;

class Solution {

    public static int minCost(String colors, int[] neededTime) {
        int left = 0;
        int right = 1;
        int result = 0;

        while (right < neededTime.length) {
            if (colors.charAt(left) == colors.charAt(right)) {
                if (neededTime[left] < neededTime[right]) {
                    result += neededTime[left];
                    left = right;
                } else {
                    result += neededTime[right];
                }
            } else {
                left = right;
            }
            right++;  // Add this line to update the 'right' pointer
        }

        return result;
    }

    public static int myPow(int x, int n) {
        return x << n - 1;
    }

    public static void main(String[] args) {

        System.out.println( myPow(2, 9) );
    }
}
