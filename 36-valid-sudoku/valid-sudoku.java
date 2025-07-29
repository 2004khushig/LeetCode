class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char v=board[i][j];
                int bIndex=(i/3)*3+(j/3);
                if(rows[i].contains(v)||cols[j].contains(v)||boxes[bIndex].contains(v)){
                    return false;
                }
                rows[i].add(v);
                cols[j].add(v);
                boxes[bIndex].add(v);
            }
            
        }
        return true;
    }
}