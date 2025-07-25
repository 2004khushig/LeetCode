class Solution {
    public List<String> wordBreak(String s, List<String> words) {
        HashSet<String>hs=new HashSet<>(words);
        return helper(s,0,hs);
    }
    public static List<String> helper(String s, int start,HashSet<String>words){
        List<String>valid=new ArrayList<>();
        if(start==s.length()){
            valid.add("");
        }
        for(int end=start+1;end<=s.length();end++){
            String pre=s.substring(start,end);
            if(words.contains(pre)){
                List<String>suff=helper(s,end,words);
                for(String si:suff){
                    valid.add(pre+(si.equals("")?"":" ")+si);
                }
            }
        }
        return valid;
    }
}