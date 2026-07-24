class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int end=s.length()-1;
        for(int i=end;i>=0;i--){
            if (s.charAt(i) == ' ') {
                if (count > 0) break;
            } else {
                count++;
            }
        }
        return count;
    }
}