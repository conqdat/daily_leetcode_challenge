import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder buffer = new StringBuilder();
        int index = 0;
        int maxLengthOfThem = Math.max(word1.length(), word2.length());

        while(index < maxLengthOfThem) {
            if(index < word1.length()) {
                buffer.append(word1.charAt(index));
            }
            if(index < word2.length()) {
                buffer.append(word2.charAt(index));
            }
            index++;
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";


        System.out.println( mergeAlternately(word1, word2) );
    }
}
