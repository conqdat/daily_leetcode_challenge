import java.util.Arrays;

class Solution {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while(numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        result[0] = left + 1;
        result[1] = right + 1;

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 2,7,11,15 };
        int target = 9;
        System.out.println( twoSum(numbers, target) );
    }
}