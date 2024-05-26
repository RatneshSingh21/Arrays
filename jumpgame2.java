  //45. Jump Game II

class Solution {
    public int jump(int[] nums) {
        int totalJump=0;

        // destination is last index
        int destination =nums.length-1;
         int coverage=0,lastJumpIdx=0;

        // Base case
         if(nums.length==1)
         {
            return 0;
         }
         for(int i=0;i<nums.length;i++)
         {
            coverage=Math.max(coverage,i+nums[i]);

            if(i==lastJumpIdx)
            {
                lastJumpIdx=coverage;
                totalJump++;
                
                 // check if we reached destination already
                if(coverage>=destination)
                {
                    return totalJump;
                }
            }
         }
         return totalJump;
    }
}
