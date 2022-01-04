class Solution {
    public int numSpecial(int[][] mat) {
        
      int[] rowmatrix = new int[mat.length];
      int[] columnmatrix = new int[mat[0].length];
        
       for(int i =0; i<mat.length; i++)
       {
           int count=0;
           for(int j =0; j<mat[i].length; j++)
           {
               if(mat[i][j]==1)
               {
                   count++;
               }
               
           }
           rowmatrix[i] = count;
       }
        
        for(int j =0; j<mat[0].length; j++)
       {
           int count=0;
           for(int i =0; i<mat.length; i++)
           {
               if(mat[i][j]==1)
               {
                   count++;
               }
               
           }
           columnmatrix[j] = count;
       }
        
       //---------------------------------------------------------------
        
        int spos=0;
        for(int i =0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                if(mat[i][j]==1  && rowmatrix[i]==1 && columnmatrix[j]==1)
                {
                    spos++;
                }
               
            }
        }
        
        return spos;
        
        
        
        
    }
}