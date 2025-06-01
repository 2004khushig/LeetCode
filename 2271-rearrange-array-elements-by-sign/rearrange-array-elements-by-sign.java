import java.util.Arrays;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi = 0; // Index for positive numbers
        int ni = 1; // Index for negative numbers
        int[] res = new int[nums.length]; // Result array initialized to zero
        for (int n : nums) {
            if (n > 0) {
                res[pi] = n; // Place positive number
                pi += 2; // Move to the next position for positive numbers
            } else {
                res[ni] = n; // Place negative number
                ni += 2; // Move to the next position for negative numbers
            }
        }
        return res;        
    }
}