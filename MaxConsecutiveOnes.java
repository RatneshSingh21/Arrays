class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int mcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                mcount=Math.max(mcount,count);
            }
            else
            {
                count=0;
            }
        }
        return mcount;
    }
}
