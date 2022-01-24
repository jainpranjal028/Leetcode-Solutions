class Solution {
    public int numSpecial(int[][] mat) {
                int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        
        int count = 0;
          for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1) count++;
            }
        }
        
        return count; 
    }
}
