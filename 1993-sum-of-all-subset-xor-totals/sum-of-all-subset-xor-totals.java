class Solution {
    public int subsetXORSum(int[] nums) {
        int total=0;
        for(int n:nums){
            total|=n;
        }
        return total*(1<<(nums.length-1));
    }
}