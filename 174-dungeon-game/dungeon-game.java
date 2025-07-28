class Solution {
    public int calculateMinimumHP(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int[][]dp=new int[m][n];
        for(int[]row:dp) Arrays.fill(row,-1);
        return solve2(0,0,m,n,nums,dp);
    }
    public static int solve2(int i,int j, int m,int n,int[][]nums, int[][]dp){
        if(i>=m||j>=n) return Integer.MAX_VALUE;
        if(i==m-1&&j==n-1) return Math.max(1,1-nums[i][j]);
        if(dp[i][j]!=-1) return dp[i][j];
        int r=solve2(i,j+1,m,n,nums,dp);
        int d=solve2(i+1,j,m,n,nums,dp);
        int total=Math.min(r,d)-nums[i][j];
        return dp[i][j]=Math.max(1,total);
    }
}