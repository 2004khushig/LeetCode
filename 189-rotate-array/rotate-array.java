class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        helper(nums,0,n-1);
        helper(nums,0,k-1);
        helper(nums,k,n-1);
    }
    public void helper(int[]nums, int s,int e){
        while(e>s){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}