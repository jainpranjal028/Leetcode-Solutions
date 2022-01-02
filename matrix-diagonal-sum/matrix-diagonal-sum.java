class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int sum = 0;            //initializes sum as 0
        int j =0;
        
        // for primary diagonal;
        for(int i=0; i<n; i++,j++)
        {
            sum = sum + mat[i][j];
        }
        
        // for secondary diagonal
        int k = n-1;
        for(int i =0; i<n; i++,k--)
        {
            sum = sum + mat[i][k];
        }
        
        //Comparing middle element of the matrix coz it appeared in both the diagonals.
        if( n%2 != 0)
        {
            sum = sum - mat[n/2][n/2];
        }
        
        return sum;
        
    }
}