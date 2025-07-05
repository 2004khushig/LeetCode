class Solution {
    public int evalRPN(String[] arr) {
         Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("-?\\d+")) {
                s.push(Integer.parseInt(arr[i]));
            }
            else if (arr[i].equals("*")) {
                s.push(s.pop() * s.pop());
            }
            else if (arr[i].equals("+")) {
                s.push(s.pop() + s.pop());
            }
            else if (arr[i].equals("-")) {
                int b = s.pop();
                int a = s.pop();
                s.push(a - b);
            }
            else {
                int b = s.pop();
                int a = s.pop();
                s.push(a / b);
            }
        }
        
        return s.pop();       
    }
}