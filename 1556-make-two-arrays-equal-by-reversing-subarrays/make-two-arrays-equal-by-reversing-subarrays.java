class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[]test=new int[1001];
        int count=0;
        for(int i=0;i<target.length;i++){
            if(test[target[i]]++==0) count++;
            if(test[arr[i]]--==1)count--;
        }
        return count==0;
    }
}