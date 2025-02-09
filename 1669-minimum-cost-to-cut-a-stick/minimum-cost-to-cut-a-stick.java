class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> c=new ArrayList<>();
        for(int cut:cuts){
            c.add(cut);
        }
        c.add(0);
        c.add(n);
        Collections.sort(c);
        int len=c.size();
        int[][]dp=new int[len][len];
        for(int size=2;size<len;size++){
            for(int i=0;i+size<len;i++){
                int j=i+size;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    int cost=c.get(j)-c.get(i)+dp[i][k]+dp[k][j];
                    dp[i][j]=Math.min(dp[i][j],cost);
                }
            }
        }
        return dp[0][len-1];
    }
}