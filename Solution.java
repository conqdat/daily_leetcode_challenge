import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int soOne(String S) {
        int result = 0;
        boolean isHaveA = false;
        for (int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == 'A') {
                isHaveA = true;
            }
            else if(S.charAt(i) == 'B' && isHaveA) {
                result += 1;
            }
        }
        return result;
    }

    public  static int solution(int[] A) {
        int count = 0;
        int previous = A[0];

        if(A.length <= 2) { return 0; }
        
        for (int i = 1; i < A.length - 1; i++) {
            int current = A[i];
            int next = A[i + 1];
        
            if (
                (previous <= current && current >= next) 
                || (previous >= current && current < next) 
            )     
            {
                count++;
                previous = current;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2,2,3,4,3,3,2,2,1,1,2,5 };
        System.out.println( solution(arr) );
    }
}