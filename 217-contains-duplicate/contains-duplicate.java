class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int a:nums){
            hs.add(a);
        }
        if(hs.size()==nums.length){
            return false;
        }
        return true;
    }
}