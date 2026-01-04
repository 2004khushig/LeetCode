class Solution {
    public int maxSubArray(int[] nums) {
        int cSum=0;
        int mSum=nums[0];
        for(int i=0;i<nums.length;i++){
            cSum=Math.max(cSum+nums[i],nums[i]);
            mSum=Math.max(cSum,mSum);
        }
        return mSum;
    }
}