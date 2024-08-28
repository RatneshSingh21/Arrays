class Solution {
    public int[] searchRange(int[] nums, int target) {

         int firstPos=  findFirstPosition(nums,target);
         int lastPos= findLastPosition(nums,target);
          return new int[]{firstPos, lastPos};

    }   
         private int findFirstPosition(int[] nums, int target)
        {
                int low = 0;
                int high = nums.length - 1;
                int firstPos = -1;
                while(low<=high)
                {
                   int mid=low+(high-low)/2;
                    if(target==nums[mid])
                    {
                        firstPos=mid;
                        high=mid-1;
                    }
                    else if(target>nums[mid])
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                return firstPos;
        }
          private int findLastPosition(int[] nums, int target){
             int low = 0;
             int high = nums.length - 1;
             int lastPos = -1;
             while(low<=high)
                {
                   int mid=low+(high-low)/2;
                    if(target==nums[mid])
                    {
                      lastPos=mid;
                        low=mid+1;
                    }
                    else if(target>nums[mid])
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
             return lastPos;
            }
    
}
