1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int Xor = 0;
5
6        for(int n : nums)
7        {
8            Xor = Xor ^ n;
9        }
10        return Xor;
11        
12    }
13}