import java.util.Arrays;

class Solution {

    public static int[] prefixSum(int[] arr) {
        int[] prefixArr = new int[arr.length];

        prefixArr[0] = arr[0];

        for(int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        System.out.println( Arrays.toString(arr) );
        System.out.println("==========");
        System.out.println( Arrays.toString(prefixArr) );

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2 , 3, 4 ,5 ,6 ,7, 8 ,9, 10 };
        System.out.println(prefixSum(arr));

    }
}