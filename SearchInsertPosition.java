class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        while(i < nums.length && target>=nums[i])
        {
            if(target==nums[i])
            {
                return i;
            }
            i++;
        }
        return i;
    }
}
