class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] direc=path.split("/");
        for(String dir:direc){
            if(dir.equals(".")||dir.isEmpty()){
                continue;
            }
        
        else if(dir.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
            else{
                stack.push(dir);
            }
        }
        return "/"+String.join("/",stack);
        
    }
}