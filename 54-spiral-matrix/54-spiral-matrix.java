class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0)
            return null;
        
        List<Integer> spiral = new ArrayList<Integer>();
        
        int c = 0;
        int col1 = 0;
        int col2 = matrix.length-1;
        
        int r = 0;
        int row1 = 0;
        int row2 = matrix[0].length-1;
        
        /*
        r = right
        d = down
        l = left
        u = up
        */
        
        
        
        while (spiral.size() < matrix.length * matrix[0].length){
            
            for (int i=row1; i<=row2 && spiral.size() < matrix.length * matrix[0].length; i++){
                spiral.add(matrix[col1][i]);
            }
            
            for (int i=col1+1; i<col2 && spiral.size() < matrix.length * matrix[0].length; i++){
                spiral.add(matrix[i][row2]);
            }
            
            for (int i=row2; i>=row1 && spiral.size() < matrix.length * matrix[0].length; i--){
                spiral.add(matrix[col2][i]);
            }
            
            for (int i=col2-1; i>col1 && spiral.size() < matrix.length * matrix[0].length; i--){
                spiral.add(matrix[i][row1]);
            }
            
            col1++;
            row1++;
            col2--;
            row2--;
            
        }
        
        return spiral;
        
    }
}