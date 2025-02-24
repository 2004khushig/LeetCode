class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = -1, right = -1;
        int max = nums[0], min = nums[n - 1];

        // Identify the right boundary
        for (int i = 1; i < n; i++) {
            if (nums[i] < max) {
                right = i; // Found an element out of order
            } else {
                max = nums[i]; // Update max so far
            }
        }

        // Identify the left boundary
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > min) {
                left = i; // Found an element out of order
            } else {
                min = nums[i]; // Update min so far
            }
        }

        return (right == -1) ? 0 : (right - left + 1);
    }
}
