class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char a=t.charAt(i);
            if(!hm.containsKey(a)||hm.get(a)==0){
                return false;
            }
            hm.put(a,hm.getOrDefault(a,0)-1);
        }
        return true;
    }
}