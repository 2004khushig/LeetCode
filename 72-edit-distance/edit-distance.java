import java.util.Arrays;

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Base case: If one string is empty, we need to insert all characters of the other
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;  // Deleting all characters from word1
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;  // Inserting all characters to word1
        }

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];  // No change needed
                } else {
                    // Take the minimum of Insert, Delete, or Replace
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],     // Delete
                                    Math.min(dp[i][j - 1],     // Insert
                                             dp[i - 1][j - 1]  // Replace
                                    ));
                }
            }
        }

        // The final answer is stored in dp[m][n]
        return dp[m][n];
    }
}
