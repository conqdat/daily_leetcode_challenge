import java.util.*;

class Solution {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],  numMap.getOrDefault(nums[i], 0) + 1 );
        }

        for(var entry: numMap.entrySet()) {
            if(entry.getValue() > nums.length / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = { 1,2 };

        System.out.println( majorityElement(nums) );
    }
}
