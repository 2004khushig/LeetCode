class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        HashSet<Integer>res=new HashSet<>();
        for(int n:nums2){
            if(set1.contains(n)){
                res.add(n);
            }
        }
        int[]result=new int[res.size()];
        int i=0;
        for(int n:res){
            result[i]=n;
            i++;
        }
        return result;
    }
}