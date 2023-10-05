import java.util.*;

// class Solution {

//     public static List<Integer> majorityElement(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         Map<Integer,Integer> numMap = new HashMap<>();

//         for(int i = 0; i < nums.length; i++) {
//             numMap.put(nums[i],  numMap.getOrDefault(nums[i], 0) + 1 );
//         }

//         for(var entry: numMap.entrySet()) {
//             if(entry.getValue() > nums.length / 3) {
//                 result.add(entry.getKey());
//             }
//         }

//         return result;
//     }
    
//     public static void main(String[] args) {
//         int[] nums = { 1,2 };

//         System.out.println( majorityElement(nums) );
//     }
// }

// Boyer-Moore Majority Vote algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Reset counts to count occurrences of the candidates
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}

