class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String o:operations){
            if(o.equals("+")){
                int sum1=stack.pop();
                int sum2=stack.peek();
                stack.push(sum1);
                stack.push(sum1+sum2);
            }
             else if (o.equals("D")) stack.push(stack.peek() * 2);
            else if (o.equals("C")) stack.pop();
            else stack.push(Integer.valueOf(o));
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;

    }
}