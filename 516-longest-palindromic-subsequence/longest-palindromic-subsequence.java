class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int[][]dp=new int[n][n];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return helper(s,0,s.length()-1,dp);

    }
    private int helper(String s, int left, int right, int [][] cache) {
        if(left==right){
            return 1;
        }
        if(left>right){
            return 0;
        }
        if(cache[left][right]!=-1){
            return cache[left][right];
        }
        if(s.charAt(left)==s.charAt(right)){
            cache[left][right]=2+helper(s,left+1,right-1,cache);
            return cache[left][right];
        }
        else{
            cache[left][right]=Math.max(helper(s,left+1,right,cache),helper(s,left,right-1,cache));
            return cache[left][right];
        }
    }
}