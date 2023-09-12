import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j < arr.length) {
                temp[j] = arr[i];
                if (arr[i] == 0) {
                    j++;
                    if (j < arr.length) {
                        temp[j] = arr[i];
                    }
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println( Arrays.toString(arr) );
    }


    public static void main(String[] args) {
        int[] nums = new int[]{ -1,0,2,3,0,4,5,0 };
        duplicateZeros(nums);
    }
}