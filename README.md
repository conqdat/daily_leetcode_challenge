# Daily Leetcode Challenge

[1679. Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs).
[643. Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i).

# Given a sequence of n strings, the task is to check if any two similar words come together and then destroy each other.

Input : ab aa aa bcd ab => Output: 'ab bcd ab'
Input: tom jerry jerry tom => Output: ''"

string => char arr => split

stringBuffer sf

loop though arr of char (after splited):
left = 0
right = left + 1;

    if str[left] == str[right]:
    	do not thing
    else
    	strignBuffer.add(left)

return stringBuffer

There are 3 tables:

1. import

- id
- created_at

2. album

- id
- name
- import_id

3. song

- id
- name
- album_id

Get "import" list that include "album" records which only have one "song" each
