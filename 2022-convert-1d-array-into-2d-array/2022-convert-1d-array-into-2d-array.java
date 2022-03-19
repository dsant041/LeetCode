class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if (original.length != m*n){
            int [][] empty = new int[0][0];
            return empty;
        }

        
        int [][] square = new int[m][n];
        
        int index = 0;
        
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                square[i][j] = original[index];
                index++;
            }
        }
        
        return square;
        
    }
}