class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[]pre=new int[n];
        int suff[]=new int[n];
        pre[0]=1;
        suff[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}