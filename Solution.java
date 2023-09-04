import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    
    public static int roundToMultiple(int n) {
        while(n % 10 != 0) {
            if(n % 10 >=5) {
                n ++;
            } else {
                n--;
            }
        }
        return n;
    } 

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        return Math.abs( 100 - roundToMultiple(purchaseAmount) );
    }

    public static int longestEqualSubarray(List<Integer> nums, int k) {
        int maxfreq = 0;
        int left = 0;
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right ++) {
            map.put(nums.get(right), map.getOrDefault(nums.get(right), 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(nums.get(right)));
            if(right - left + 1 - maxfreq > k) {
                map.put(nums.get(left), nums.get(left) - 1);
                left++;
            }
        }
        return maxfreq;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,2,3,1,3));


        System.out.println( longestEqualSubarray(nums, 3));
    }
}