class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,Comparator.comparingInt(a->-a[1]));
        int ans=0;
        int n=boxTypes.length;
        int i=0;
        while(i<n && truckSize>0){
            int maxim=Math.min(boxTypes[i][0],truckSize);
            ans+=maxim*boxTypes[i][1];
            i++;
            truckSize-=maxim;
        }
        return ans;
    }
}