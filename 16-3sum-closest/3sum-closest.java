class Solution {
    public int threeSumClosest(int[] arr, int t) {
        Arrays.sort(arr);
        int cSum=arr[0]+arr[1]+arr[2];
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(Math.abs(t-sum)<Math.abs(t-cSum)){
                    cSum=sum;
                }
                if(sum<t){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return cSum;
    }
}