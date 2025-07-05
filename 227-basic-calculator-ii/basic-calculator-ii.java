class Solution {
    public int calculate(String s) {
        int num=0;
        char op='+';
        Stack<Integer>stack=new Stack<>();
        char[]charA=s.toCharArray();
        int i=0;
        for(char c:charA){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(!Character.isDigit(c) && c!=' '||i==s.length()-1){
                if(op=='/'){
                    stack.push(stack.pop()/num);
                }
                else if(op=='*'){
                    stack.push(stack.pop()*num);
                }
                else if(op=='+'){
                    stack.push(num);
                }
                else{
                    stack.push(-num);
                }num=0;
                op=c;
            }
            i++;
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}