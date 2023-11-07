import java.util.Arrays;

class Solution {

    public static int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i = 0; i < result.length; i++) {
            result[i] = sumOfNum( Integer.bitCount(i) );
        }
        System.out.println( Arrays.toString(result) );
        return result;
    }
    

    public static int sumOfNum(int n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n = n / 10;
        }
        
        return result;
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;
            if(leftSum == rightSum) {
                return i;
            } 
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        System.out.println( pivotIndex(nums) );


        System.out.println("-----------------------");

        int n = 5;

        // System.out.println( countBits(n) );


        // Right shift:     System.out.println( 80 >> 3 ); // 80 / 2^3 = 80  
        // Left shift:      System.out.println( 2 << 5 ); // 2 * 2^5 = 64


        // System.out.println( 3 | (1 << 3) );


        System.out.println( 4 & 7);
        System.out.println( 4 | 7);
        System.out.println(4 ^ 7);

        System.out.println("===================");
        System.out.println(1024 | (1 << 2)); // 1020 | 1 * 2^2
        System.out.println(1024 | (1 * 2^2));
    }
}