import java.util.*;

class Solution {


    public static int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else if(stack.size() != 0) {
                stack.pop();
            } else {
                count ++;
            }
        }
        return Math.max(stack.size(), count);
    }



    public static void main(String[] args) {
        String s = "())";

        System.out.println( minAddToMakeValid(s) );
    }
}
