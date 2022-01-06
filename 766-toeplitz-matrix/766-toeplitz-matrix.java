class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        if(matrix.length == 1 && matrix[0].length == 1)
        {
               return true;
        }
        
        int lengthR = matrix.length - 1, lengthC = matrix[0].length - 1;
         
        for(int i =0 ; i<lengthR; i++)
        {
            for(int j =0; j<lengthC; j++)
            {
                if(matrix[i][j] != matrix[i+1][j+1])
                {
                    return false;
                } 
            }
        }
        return true;
    }
}