class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int st=0;
        int e=s.length()-1;
        while(st<=e){
            char charFirst=s.charAt(st);
            char charEnd=s.charAt(e);
            if(!Character.isLetterOrDigit(charFirst)){
                st++;
            }
            else if(!Character.isLetterOrDigit(charEnd)){
                e--;
            }
            else{
                if(Character.toLowerCase(charFirst) != Character.toLowerCase(charEnd)){
                    return false;
                }
                st++;
                e--;
            }
        }
        return true;
    }
}