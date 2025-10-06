class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxL=0;
        HashSet<Character>hs=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(r));
            maxL=Math.max(maxL,r-left+1);
        }
        return maxL;
    }

}