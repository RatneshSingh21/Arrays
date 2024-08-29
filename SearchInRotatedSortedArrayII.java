class Solution {
    public boolean search(int[] nums, int target) {
       
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (nums[mid] == target) {
                return true; 
            }
             // Handle duplicates: nums[left] == nums[mid] == nums[right]
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } 
            // Determine which half is sorted
           else if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }

        return false; 
 

    }
}
