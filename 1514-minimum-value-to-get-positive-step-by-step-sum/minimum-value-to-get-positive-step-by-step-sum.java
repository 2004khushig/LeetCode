class Solution {
    public int minStartValue(int[] nums) {
        if(nums==null){
            throw new IllegalArgumentException("Input array is null");
        }
        int minVal=0;
        int prefixSum=0;
        for(int n:nums){
            prefixSum+=n;
            minVal=Math.min(minVal,prefixSum);
        }
        return 1-minVal;
        
    }
}