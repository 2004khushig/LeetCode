class Solution {
    public boolean isPalindrome(String s) {
       if(s.isEmpty()){
        return true;
       }
       int st=0;
       int end=s.length()-1;
       while(st<=end){
        char sta=s.charAt(st);
        char e=s.charAt(end);
        if(!Character.isLetterOrDigit(sta)){
            st++;
        }
        else if(!Character.isLetterOrDigit(e)){
            end--;
        }
        else{
            if(Character.toLowerCase(sta)!=Character.toLowerCase(e)){
                return false;
            }
            st++;
            end--;
        }

       }
       return true;

    }
}