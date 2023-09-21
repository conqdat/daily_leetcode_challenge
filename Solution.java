import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put( nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        for(int i: map.keySet()) {
            System.out.println(i);
            if(map.get(i) > 2) {
                result += 2;
            } else {
                result += map.get(i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,1,1,2,3,3 };

        System.out.println( removeDuplicates(arr) );

    }
}
