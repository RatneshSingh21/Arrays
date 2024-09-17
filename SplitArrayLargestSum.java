class Solution {
    public int sums(int[] arr, int m) {
        int n = arr.length;
        int subarrayCount = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > m) {
                subarrayCount++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return subarrayCount;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            high += nums[i];
            low = Math.max(low, nums[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int subarrays = sums(nums, mid);

            if (subarrays > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

      return low;
    }
}
