class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int n=s.length();
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int one=s.charAt(i-1)-'0';
            int two=Integer.parseInt(s.substring(i-2,i));
            if(one!=0){
                dp[i]+=dp[i-1];
            }
             if (10 <= two && two <= 26) {
                dp[i] += dp[i - 2];
            }

        }
        return dp[n];
    }
}