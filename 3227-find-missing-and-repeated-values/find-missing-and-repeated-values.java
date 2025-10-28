class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        boolean[]seen=new boolean[total+1];
        int r=-1, m=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                if(seen[val]){
                    r=val;
                }
                else{
                    seen[val]=true;
                }
            }
        }
        for(int i=1;i<=total;i++){
            if(!seen[i]){
                m=i;
                break;
            }
        }
        return new int[]{r,m};
    }
}