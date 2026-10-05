class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int index=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else{
                i++;
            }
        }
        for(int ii=0;ii<n;ii++){
            if(nums[ii]!=ii+1){
                return ii+1;
            }
        }
        return n+1;
    }
}