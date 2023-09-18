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

    public static boolean validMountainArray(int[] arr) {
        int maxValueIndex = 0;
        if(arr.length < 3) return false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[maxValueIndex] < arr[i]) maxValueIndex = i;
        }
        if(maxValueIndex == arr.length - 1) return false;
        for(int i = 0; i < maxValueIndex - 1; i++) {
            int j = i + 1;
            if(arr[j] <= arr[i]) {
                return false;
            }
        }
        for(int i = maxValueIndex; i < arr.length - 1; i++) {
            int j = i + 1;
            if(arr[j] >= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,2,3,4,5,6,7,8,9 };

        System.out.println( validMountainArray(arr) );
    }
}
