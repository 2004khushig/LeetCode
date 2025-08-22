class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>s=new Stack<>();
        s.push(-1);
        int area=0;
        for(int i=0;i<heights.length;i++){
            while(s.peek()!=-1 && heights[i]<=heights[s.peek()]){
                int h=heights[s.pop()];
                int w=i-s.peek()-1;
                area=Math.max(area,h*w);
            }
            s.push(i);
        }
        while(s.peek()!=-1){
            int h=heights[s.pop()];
            int w=heights.length-s.peek()-1;
            area=Math.max(area,h*w);
        }
        return area;
    }
}