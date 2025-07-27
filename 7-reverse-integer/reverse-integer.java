class Solution {
    public int reverse(int n) {
        int x=Math.abs(n);
        int rev=0;
        while(x!=0){
            int a=x%10;
            if(rev>(Integer.MAX_VALUE-a)/10){
                return 0;
            }
            rev=rev*10+a;
            x=x/10;
        }
        return(n<0)?-rev:rev; 
    }
}
