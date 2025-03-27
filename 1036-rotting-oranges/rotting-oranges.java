import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minute = 0;
        int fresh = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> q = new LinkedList<>();

        // Step 1: Store initial rotten oranges and count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If there are no fresh oranges, return 0 immediately
        if (fresh == 0) {
            return 0;
        }

        // Step 2: BFS traversal
        while (!q.isEmpty()) {
            int qsize = q.size();
            boolean rotted = false; // Track if at least one fresh orange is rotted in this round

            while (qsize-- > 0) {
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];

                for (int[] d : dir) {
                    int newi = i + d[0];
                    int newj = j + d[1];

                    if (newi >= 0 && newi < m && newj >= 0 && newj < n && grid[newi][newj] == 1) {
                        grid[newi][newj] = 2;
                        q.add(new int[]{newi, newj});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            // Increment minutes only if some oranges got rotted
            if (rotted) {
                minute++;
            }
        }

        // If there are still fresh oranges left, return -1
        return fresh == 0 ? minute : -1;
    }
}
