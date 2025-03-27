class Solution {
    public boolean validColouring(int[][] graph, int[] color, int node, int col){
        if(color[node]!=0){
            return color[node]==col;
        }
        color[node]=col;
        for(int ne:graph[node]){
            if(!validColouring(graph,color,ne,-col)){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];

        for (int node = 0; node < n; node++) {
            if (colour[node] == 0 && !validColouring(graph, colour, node, 1))
                return false;
        }

        return true;
    }
}