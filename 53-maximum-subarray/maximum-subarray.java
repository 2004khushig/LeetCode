class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int maxs=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            csum+=nums[i];
            if(csum>maxs){
                maxs=csum;
            }
            if(csum<0){
                csum=0;
            }
        }
        return maxs;
    }
}