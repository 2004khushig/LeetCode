class Solution {
    
        public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        int[][]dp=new int[a+1][b+1];
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                dp[i][j]=-1;
            }
        }
        return helper(a,b,text1,text2,dp);
    }
    static int helper(int a,int b,String text1,String text2, int[][]dp){
        if(a==0||b==0){
            return 0;
        }
        if(dp[a][b]!=-1){
            return dp[a][b];
        }
        if(text1.charAt(a-1)==text2.charAt(b-1)){
            return dp[a][b]=1+helper(a-1,b-1,text1,text2,dp);
        }
        else{
            return dp[a][b]=Math.max(helper(a-1,b,text1,text2,dp),helper(a,b-1,text1,text2,dp));
        }
    }
    
}