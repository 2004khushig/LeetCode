class Solution {
    static int max=0;
    private void dfs(int i,int j,int m,int n,int[][] grid,int[]curr){
        if(i<0||i>=m||j<0||j>=n){
            return;
        }
        if(grid[i][j]==1){
            grid[i][j]=0;
            curr[0]++;
            max=Math.max(max,curr[0]);
             dfs(i-1,j,m,n,grid,curr);
            dfs(i,j-1,m,n,grid,curr);
            dfs(i+1,j,m,n,grid,curr);
            dfs(i,j+1,m,n,grid,curr);
        }
        else return;
    }
    public int maxAreaOfIsland(int[][] grid) {
        max=0;
        int[] curr = new int[1];
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    curr[0]=0;
                    dfs(i,j,m,n,grid,curr);
                }
            }
        }
        return max;
        
    }
}