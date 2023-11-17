import java.util.Stack;

class Solution {

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // If the stack is not empty, pop the closest non-star character
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";

        System.out.println( removeStars(s) );
    }
}