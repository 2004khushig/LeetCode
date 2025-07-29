class Solution {
    public int numTrees(int n) {
        int[]unique=new int[n+1];
        for(int i=0;i<=n;i++){
            unique[i]=1;
        }
        for(int i=2;i<=n;i++){
            int total=0;
            for(int j=1;j<=i;j++){
                total+=unique[j-1]*unique[i-j];
            }
            unique[i]=total;
        }
        return unique[n];
    }
}