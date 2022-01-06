class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        int n = image.length;
        
        
        //First reverse the image horizontally
        for(int i =0; i<n; i++)
        {
            int k=n-1;
          
            for(int j =0; j<n/2; j++)
            {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                k--;
            }
            
        }
        
        //Now, Invert the image 
        for(int i=0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(image[i][j] == 1)
                {
                    image[i][j] = 0;
                }
                else
                {
                    image[i][j] =1;
                }
            }
        }
        
        return image;
        
        
        
        
        
        
        
    }
}