class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;
        Set<Character>hs=new HashSet<>();
        for(char c:s.toCharArray()){
            hs.add(c);
        }
        for(char c:hs){
            int start=s.indexOf(c);
            int end=s.lastIndexOf(c);
            if(start<end){
                Set<Character>res=new HashSet<>();
                for(int i=start+1;i<end;i++){
                    res.add(s.charAt(i));
                }
                ans+=res.size();
            }
        }
        return ans;
    }
}