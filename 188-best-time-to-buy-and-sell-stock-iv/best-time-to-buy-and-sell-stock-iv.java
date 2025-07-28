class Solution {
    static int[][][]dp;
    public int maxProfit(int k, int[] nums) {
        int n=nums.length;
        dp=new int[n][k+1][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<=k;j++){
                dp[i][j][0]=-1;
                dp[i][j][1]=-1;
            }
        }
        return solve2(0,k,nums,1);
    }
    public static int solve2(int i,int k, int[]nums,int canBuy){
        if(k<=0 || i>=nums.length) return 0;
        if(dp[i][k][canBuy]!=-1) return dp[i][k][canBuy];
        if(canBuy==1){
            int buy=-nums[i]+solve2(i+1,k,nums,0);
            int notBuy=solve2(i+1,k,nums,1);
            return dp[i][k][canBuy]=Math.max(buy,notBuy);
        }
        else{
            int sell=nums[i]+solve2(i+1,k-1,nums,1);
            int hold=solve2(i+1,k,nums,0);
            
            return dp[i][k][canBuy]=Math.max(sell,hold);
        }
    }
}