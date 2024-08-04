class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;

        //sum of the first n natural numbers.
        int totalSum = n * (n + 1) / 2; 

        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        
        return totalSum - arraySum;
    }
}
