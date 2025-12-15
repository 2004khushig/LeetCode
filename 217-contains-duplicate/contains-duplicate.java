class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        if(hs.size()!=nums.length){
            return true;
        }
        return false;
    }
}