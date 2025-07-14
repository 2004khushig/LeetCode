class Solution {
    Map<String,Boolean>mp=new HashMap<>();
    public boolean isScramble(String a, String b) {
         
        int n=a.length();
        if(b.length()!=n){
            return false;
        }
        if(a.equals(b)){
            return true;
        }
        
        if(n==1){
            return false;
        }
        String key=a+" "+b;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        for(int i=1;i<n;i++){
            boolean woswap=(isScramble(a.substring(0,i),b.substring(0,i))&&isScramble(a.substring(i),b.substring(i)));
            if(woswap){
                mp.put(key,true);
                return true; 
            }
            boolean wswap=(isScramble(a.substring(0,i),b.substring(n-i))&&isScramble(a.substring(i),b.substring(0,n-i)));
            if(wswap){
                mp.put(key,true);
                return true;
            }
        }
        mp.put(key,false);
        return false;
    }
}