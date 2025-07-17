class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer>s=new Stack<>();
        int max=0;
        s.push(0);
        for(int i=1;i<nums.length;i++){
            while(!s.isEmpty()&& nums[i]<=nums[s.peek()]){
                max=getMax(nums,s,max,i);
            }
            s.push(i);
        }
        int i=nums.length;
        while(!s.isEmpty()){
            max=getMax(nums,s,max,i);
        }
        return max;
    }
    public static int getMax(int[]nums,Stack<Integer>s,int max,int i){
        int area=0;
        int popped=s.pop();
        if(s.isEmpty()){
            area=nums[popped]*i;
        }
        else{
            area=nums[popped]*(i-1-s.peek());
        }
        return Math.max(area,max);
    }
}