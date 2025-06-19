class Solution {
    public int rob(int[] nums) {
        int rob=0;
        int norob=0;
        for(int i=0;i<nums.length;i++){
            int newRob=norob+nums[i];
            int nnewRob=Math.max(rob,norob);
            rob=newRob;
            norob=nnewRob;
        }
        return Math.max(norob,rob);
    }
}