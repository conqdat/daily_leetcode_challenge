import java.util.*;

class Solution {

    public static int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int op = 0;
        
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                i++;
                j--;
                op++;
            } else if (arr[i] + arr[j] < k) {
                i++;
            } else if (arr[i] + arr[j] > k) {
                j--;
            }
        }
        
        return op;
    }
    
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        int k = 5;
        System.out.println( maxOperations(nums, k) );
    }
}