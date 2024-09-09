class Solution {

     // Helper function to compute the sum with the given divisor
       int computeSum(int[] nums, int divisor){
            int sum = 0;
            for (int num : nums) {
                sum += Math.ceil((double) num / divisor);
            }
            return sum;
       }

    public int smallestDivisor(int[] nums, int threshold) {
    // Start left from 1 to avoid division by zero
       int left = 1, right = 1000000; 
       
       while (left < right) {
           int mid = left + (right - left) / 2;

           if (computeSum(nums, mid) > threshold) {
            // If sum exceeds threshold, increase the divisor
               left = mid + 1; 
           } else {
            // If sum is within threshold, try smaller divisors
               right = mid; 
           }
       }
       return left;  // The smallest divisor that keeps the sum <= threshold
    }
}
