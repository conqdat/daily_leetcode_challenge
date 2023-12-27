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

    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3, 4, 1};

        System.out.println(minCost(colors, neededTime));
    }
}
