class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sp=0;
        int tsp=0;
        int start=0;
        for(int i=0;i<n;i++){
            tsp+=gas[i]-cost[i];
            sp+=gas[i]-cost[i];
            if(sp<0){
                sp=0;
                start=i+1;
            }
        }
        return(tsp<0)?-1:start;
    }
}