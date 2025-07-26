class Solution {
    public String convert(String s, int n) {
        if(n==1){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=i;j<s.length();j+=(2*(n-1))){
                sb.append(s.charAt(j));
                if(i>0 && i<n-1 && j+(2*(n-1))-(2*i)<s.length()){
                    sb.append(s.charAt(j+(2*(n-1))-(2*i)));
                }
            }
        }
        return sb.toString();
    }
}