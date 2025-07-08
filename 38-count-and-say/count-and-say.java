class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String a=countAndSay(n-1);
        int b=a.length();
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<b;i++){
            if(a.charAt(i)==a.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count).append(a.charAt(i-1));
                count=1;
            }
        }
        sb.append(count).append(a.charAt(b-1));
        return sb.toString();
    }
}