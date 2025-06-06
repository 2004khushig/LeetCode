class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            int len=str.length();
            if(len%2!=0){
                continue;
            }
            int half=len/2;
            int left=0;
            int right=0;
            for(int j=0;j<half;j++){
                left+=str.charAt(j)-'0';
            }
            for(int j=half;j<len;j++){
                right+=str.charAt(j)-'0';
            }
            if(left==right){
                count++;
            }
        }
        return count;
    }
}