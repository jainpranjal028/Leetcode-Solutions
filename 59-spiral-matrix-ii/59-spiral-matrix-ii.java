class Solution {
    public int[][] generateMatrix(int n) {
        int minr = 0;
        int maxr = n-1;
        int minc = 0;
        int maxc =n-1;
        int count = 1;
        int[][] result = new int[n][n];
        while(count <= n*n)
        {
            //from minc to maxc
            for(int j = minc; j<=maxc; j++)
            {
                result[minr][j] = count++;
            }
            minr++;
            
            //from minr to maxr
            for(int i=minr ; i<=maxr; i++)
            {
                result[i][maxc] = count++;
                
            }
            maxc--;
            
            //from maxc to minc
            for(int j=maxc ; j>=minc ; j--)
            {
                result[maxr][j] = count++;
            }
            maxr--;
            
            //from maxc to minc
            for(int i=maxr; i>=minr; i--)
            {
                result[i][minc] = count++;
                
            }
            minc++;
            
        }
        return result;
        
    }
}