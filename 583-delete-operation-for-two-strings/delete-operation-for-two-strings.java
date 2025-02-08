class Solution {
    public int minDistance(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int[][]dp=new int[a+1][b+1];
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int res=dp[a][b];
        int del=a-res;
        int insert=b-res;
        return del+insert;
    }
}