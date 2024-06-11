//question:https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        // Start with the first position
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
      // FIll all non-zero numbers
      if (nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }

    while (j < nums.length) {
      nums[j++] = 0;
    }
    }
}
