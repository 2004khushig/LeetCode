class Solution {
    public int findPairs(int[] nums, int k) {
        final Map<Integer, Integer> counts = new HashMap<>();
        for(int n:nums){
            counts.put(n,counts.getOrDefault(n,0)+1);
        }
        int count=0;
        for(int key:counts.keySet()){
            if((k > 0 && counts.containsKey(key + k)) || (k == 0 && counts.get(key) > 1))
                count++;
        }
        return count;
    }
}