import java.util.Arrays;

class Solution {

    public static String reverseWords(String s) {
        String[] charArr = s.split(" ");

        for(int i = 0; i < charArr.length; i++) {
            charArr[i] = new StringBuffer(charArr[i]).reverse().toString();
        }

        return String.join(" ", charArr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println( reverseWords(s) );
    }
}