class Solution {
    public int numDistinct(String s, String t) {
        int[][]mem=new int[t.length()+1][s.length()+1];
        for(int j=0;j<=s.length();j++){
            mem[0][j]=1;
        }
        for(int i=0;i<t.length();i++){
            for(int j=0;j<s.length();j++){
                if(t.charAt(i)==s.charAt(j)){
                    mem[i+1][j+1]=mem[i][j]+mem[i+1][j];
                }
                else{
                    mem[i+1][j+1]=mem[i+1][j];
                }
            }
        }
        return mem[t.length()][s.length()];
    }
}