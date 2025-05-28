class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;
        for(char[]row:box){
            int drop=n-1;
            for(int curr=n-1;curr>=0;curr--){
                if(row[curr]=='*'){
                    drop=curr-1;
                }
                else if(row[curr]=='#'){
                    char temp=row[drop];
                    row[drop]=row[curr];
                    row[curr]=temp;
                    drop--;
                }
            }
        }
        char[][] rotatedBox = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[j][m - 1 - i] = box[i][j];
            }
        }
        
        return rotatedBox;
    }
}