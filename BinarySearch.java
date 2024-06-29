class Solution {
    public int search(int[] nums, int target) {
        int index = 0;
        for (int number : nums)
         {
            if(number==target)
            {
                return index;
            }
            index++;
         }
     return -1;    
    }
}
