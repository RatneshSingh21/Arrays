//question: https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) { // Continue loop until n becomes 1 (happy) or 4 (part of the unhappy cycle)
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1; // If n is 1, it is a happy number; otherwise, it is not
    }
}
