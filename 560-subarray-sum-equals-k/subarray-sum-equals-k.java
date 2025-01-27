class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int total=0,count=0;
        for(int n:nums){
            total+=n;
            if(mp.containsKey(total-k)){
                count+=mp.get(total-k);
            }
            mp.put(total,mp.getOrDefault(total,0)+1);
        }
        return count;
    }
}