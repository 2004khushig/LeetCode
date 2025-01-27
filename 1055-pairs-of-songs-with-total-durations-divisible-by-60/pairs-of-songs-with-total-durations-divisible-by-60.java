class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60]; // To count occurrences of each remainder
        int count = 0;

        for (int t : time) {
            int remainder = t % 60; // Calculate remainder
            int complement = (60 - remainder) % 60; // Find the complement remainder

            // Add the count of songs with the complement remainder
            count += remainders[complement];

            // Update the count of the current remainder
            remainders[remainder]++;
        }

        return count;
    }
}
