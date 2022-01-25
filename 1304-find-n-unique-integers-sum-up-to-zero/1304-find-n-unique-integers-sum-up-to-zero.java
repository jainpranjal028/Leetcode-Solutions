class Solution {
    public int[] sumZero(int n) {
        
        int[] result = new int[n];
        int k=7;
        if(n%2==0)
        {
            for(int i=0; i<n; i=i+2)
            {
                result[i] = k;
                result[i+1]= k - 2*k;
                k++;
            }
        }
        else
        {
            int z=5;
            for(int i=0; i<n-1; i=i+2)
            {
                result[i] = z;
                result[i+1] = z - 2*z;
                z++;
                
            }
            result[n-1] = 0;
        }
        return result;
    }
}