class Solution {
    public long minCost(int[] nums, int[] cost) {
        
        int left=nums[0];
        int right=nums[0];
        for(int i:nums){
            left=Math.min(i,left);
            right=Math.max(i,right);
        }
        long ans=0;
        while(left<right){
            int mid=(left+right)/2;
            long c1=helper(nums,cost,mid);
            long c2=helper(nums,cost,mid+1);
            if(c1>c2){
                left=mid+1;
                ans=c2;
            }
            else{
                right=mid;
                ans=c1;
            }
        }
        return ans;
    }
    public long helper(int [] nums, int [] cost, int all){
        long totalCost = 0L;
        for(int i = 0;i<nums.length;i++){
            totalCost += 1L*Math.abs(nums[i]-all)*cost[i];
        }
        return totalCost;
    }
}