class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean>result=new ArrayList<>();
        for(String s:queries){
            result.add(isMatch(s,pattern));
        }
        return result;
    }
    private boolean isMatch(String s,String pattern){
        int j=0;
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            if(j<pattern.length() && sChar==pattern.charAt(j)){
                j++;
            }
            else if(Character.isUpperCase(sChar)){
                return false;
            }
        }
        return j==pattern.length();
        
    }
}