class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m=num1.length;
        int n=num2.length;
        int[]merge=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(num1[i]<num2[j]){
                merge[k++]=num1[i++];
            }
            else{
                merge[k++]=num2[j++];
            }
        }
        while(i<m) merge[k++]=num1[i++];
        while(j<n) merge[k++]=num2[j++];
        int total=m+n;
        if(total%2==0){
            return (merge[total/2-1]+merge[total/2])/2.0;
        }
        else{
            return merge[total/2];
        }
    }
}