class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
        
    }
    public void reverse(int nums[],int s,int e){
        while(s<e){
            int swap = nums[s];
            nums[s] =  nums[e];
            nums[e] = swap;
            s++;
            e--; 
        }
    }
}