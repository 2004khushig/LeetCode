class Solution {
    public boolean isPalindrome(String s) {
       if(s.isEmpty()){
        return true;
       }
       int start=0;
       int end=s.length()-1;
       while(start<=end){
        char startA=s.charAt(start);
        char endA=s.charAt(end);
        if(!Character.isLetterOrDigit(startA)){
            start++;
        }
        else if(!Character.isLetterOrDigit(endA)){
            end--;
        }
        else{
            if(Character.toLowerCase(startA)!=Character.toLowerCase(endA)){
                return false;
            }
            start++;
            end--;
        }

       }
       return true;
    }
}