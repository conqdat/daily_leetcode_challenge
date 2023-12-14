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
        // String s = "())";
        // System.out.println( minAddToMakeValid(s) );

        int[] nums = {1,2,3,4,4,45,54,1};
        int a = 0, b = 0, c = 0;

        for(int i = 0; i < nums.length; i++) {
            b = nums[i];
            System.out.println("b : "+ b);
            i++;
        }

        System.out.println("==============");

        for(int i = 0; i < nums.length; i++) {
            c = nums[i++];
            System.out.println("c : "+ c);
        }

    }
}
