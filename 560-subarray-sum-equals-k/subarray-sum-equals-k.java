class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
        int presum=0;
        int count=0;
        mp.put(0,1);
        for(int i=0;i<n;i++){
            presum+=nums[i];
            int rem=presum-k;
            count+=mp.getOrDefault(rem,0);
            mp.put(presum,mp.getOrDefault(presum,0)+1);
        }
        return count;

    }
}