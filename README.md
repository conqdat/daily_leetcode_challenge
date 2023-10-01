# Daily Leetcode Challenge
[334. Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence).

If the current number is less than or equal to first, update first with the current number.
If the current number is greater than first but less than or equal to second, update second with the current number.
If the current number is greater than both first and second, it means you've found an increasing triplet, so return true.
If you don't find an increasing triplet after iterating through the entire array, return false.

Now, if you run this code with the test case [1,5,0,4,1,3], it will correctly return true because there's an increasing triplet [1,4,5] in the array. However, if you run this code with the test case [1,5,0,4,1,2], it will incorrectly return true because there's an increasing triplet [1,2,5] in the array. This is because the code above only checks for increasing triplets that are adjacent to each other. In other words, it only checks for increasing triplets that are in the form [x,y,z] where y is right next to x and z is right next to y. However, there can be increasing triplets that are not adjacent to each other. For example, in the array [1,5,0,4,1,2], there's an increasing triplet [0,1,2] where 0 is not adjacent to 1 and 2 is not adjacent to 1.