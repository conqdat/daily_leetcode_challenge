import java.util.*;

class Solution {

    public static String largestOddNumber(String num) {
        // Check if the last digit of the input number is odd
        if ((int) num.charAt(num.length() - 1) % 2 == 1) {
            return num; // If odd, return the original number
        }

        int i = num.length() - 1;
        // Iterate from the end of the string towards the beginning
        while (i >= 0) {
            int n = num.charAt(i);
            // Check if the current digit is odd
            if (n % 2 == 1) {
                // If odd, return the substring from the beginning up to the current index
                return num.substring(0, i + 1);
            }
            i--; // Move to the previous digit
        }
        return ""; // Return an empty string if no odd digit is found
    }


    public static void main(String[] args) {

        String num = "4206";

        System.out.println( largestOddNumber(num) );

    }
}
