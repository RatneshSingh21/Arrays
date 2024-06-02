//Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
               // Return indices of the two numbers
                return new int[]{i + 1, j + 1};
            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
              
            }
            else
            {
                j--;
            }
            
        }
        return new int[0];
    }
}
