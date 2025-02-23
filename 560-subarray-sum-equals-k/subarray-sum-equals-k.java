class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap();
        int preSum=0;
        int count=0;
        mp.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            count +=mp.getOrDefault(remove,0);
            mp.put(preSum,mp.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}