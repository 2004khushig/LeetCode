class Solution {
    public boolean digitCount(String num) {
        final int[]count=new int[10];
        final char[] digits=num.toCharArray();
        for(final char d:digits){
            count[d-'0']++;
        }
        for(int i=0;i<digits.length;i++){
            if(count[i]!=digits[i]-'0'){
                return false;
            }
        }
        return true;
        
    }
}