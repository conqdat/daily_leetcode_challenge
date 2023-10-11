import java.util.*;


class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        double result = -10000;
        for(int i = 0; i < nums.length - k + 1; i ++) {
            double currentSum = 0;
            for(int j = 0; j < k; j++) {
                currentSum += nums[i+j];
            }
            result = Math.max(currentSum / k, result);
        }

        return result;
    }


    public static int maxVowels(String s, int k) {
        int result = 0;
        for(int i = 0; i < s.length() - k + 1; i++) {
            int currentCount = 0;
            for(int j = 0; j < k; j++) {
                if(s.charAt(i+j) == 'i' || 
                   s.charAt(i+j) == 'o' || 
                   s.charAt(i+j) == 'e' || 
                   s.charAt(i+j) == 'a' || 
                   s.charAt(i+j) == 'u' ) 
                {
                    currentCount += 1;
                }
            }
            result = Math.max(result, currentCount);
        }

        return result;
    }

    public int maxVowelsVersionTwo(String s, int k) {
        int result = 0;
        int currentCount = 0;
        
        // Calculate the count of vowels for the first 'k' characters.
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }
        result = currentCount;

        // Use a sliding window to calculate the maximum vowel count.
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            result = Math.max(result, currentCount);
        }

        return result;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;

        System.out.println( maxVowels(s, k) );
    }
}