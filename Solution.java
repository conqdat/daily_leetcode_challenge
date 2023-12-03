import java.util.*;

class Solution {
    

    public static void insertionSort(int[] nums) {
        for (int j = 1; j < nums.length; j++) {
            int value = nums[j];
            int i = j - 1;
            while (i > 0 && nums[i] > value) {
                nums[i + 1] = nums[i];
                i = i - 1;
            }
            nums[i + 1] = value;
        }
        System.out.println( Arrays.toString(nums) );
    }
    

    public static void quickSort(int[] nums, int L, int R) {
        if(L >= R) return;
        int key = nums[(L+R) / 2];
        int k = partition(nums, L, R, key);

        quickSort(nums, L, k -1);
        quickSort(nums, k, R);
    }

    // Return pivot value
    public static int partition(int[] nums, int L, int R, int key) {
        int iL = L;
        int iR = R;

        while(iL <= iR) {
            // iL: item >= key --> swap
            while(nums[iL] < key) iL++;
            // iR: item <= --> swap
            while(nums[iR] > key) iR--;
            if(iL <= iR) {
                int temp = nums[iL];
                nums[iL] = nums[iR];
                nums[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }


    public static int[] mergerSort(int[] arr, int L, int R) {
        // Edge case & Stop condition
        if(L > R) return new int[0];

        if(L == R) {
            int[] singleElement = {arr[L]};
            return singleElement;
        }

        // Divide
        int k = (L + R) / 2;
        int[] leftArr = mergerSort(arr, L, k);
        int[] rightArr = mergerSort(arr, k+1, R);

        // Merge
        return merge(leftArr, rightArr);
    }

    public static int[] merge(int[] leftArr, int[] rightArr) {
        int[] result = new int[leftArr.length + rightArr.length];
        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while(i < result.length) {
            // left & right arr != null
            if(i1 < leftArr.length && i2 < rightArr.length) {
                if(leftArr[i1] <= rightArr[i2]) {
                    result[i] = leftArr[i1];
                    i++; 
                    i1++;
                } else {
                    result[i] = rightArr[i2];
                    i++; 
                    i2++;
                }
            } 
            // leftArr || rightArr == null
            else {
                if(i1 < leftArr.length) {
                    result[i] = leftArr[i1];
                    i++; 
                    i1++;
                } else {
                    result[i] = rightArr[i2];
                    i++; 
                    i2++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 6,7,8,5,4,3,2,1 };
        // insertionSort(nums);

        // quickSort(nums, 0, nums.length - 1);

        mergerSort(nums, 0, nums.length - 1);
    }
}
