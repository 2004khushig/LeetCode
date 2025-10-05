class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            int l=sb.length();
            if(l>0 && sb.charAt(l-1)==c){
                sb.deleteCharAt(l-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}