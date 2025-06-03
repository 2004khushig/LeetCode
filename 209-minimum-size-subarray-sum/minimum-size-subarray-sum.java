class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int l=0;
        int cSum=0;
        for(int r=0;r<nums.length;r++){
            cSum+=nums[r];
            while(cSum>=target){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                }
                cSum-=nums[l];
                l++;
            }
        }
        return minLen!=Integer.MAX_VALUE?minLen:0;
    }
}