class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char st=s.charAt(start);
            char en=s.charAt(end);
            if(!Character.isLetterOrDigit(st)){
                start++;
            }
            else if(!Character.isLetterOrDigit(en)){
               end--;
             }
            else{
                if(Character.toLowerCase(st)!=Character.toLowerCase(en)){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
        

    }
}