class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>h1=new HashSet<>();
        for(int n:nums1){
            h1.add(n);
        }
        HashSet<Integer>ans=new HashSet<>();
        for(int n:nums2){
            if(h1.contains(n)){
                ans.add(n);
            }
        }
        int[]ans1=new int[ans.size()];
        int i=0;
        for(int n:ans){
            ans1[i]=n;
            i++;
        }
        return ans1;
    }
}