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
    public static boolean checkIfExist(int[] arr) {
    Set<Integer> seen = new HashSet<>();

    for (int num : arr) {
        if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
            return true;
        }
        seen.add(num);
    }

    return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10,2,5,3 };

        System.out.println( checkIfExist(arr) );
    }
}
