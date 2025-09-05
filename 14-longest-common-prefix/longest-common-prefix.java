class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return sb.toString();
            }
            else{
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }
}