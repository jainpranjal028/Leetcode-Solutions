class Solution {
    public boolean isPowerOfFour(int n) {
        
        int k =0;
        int count=0;
        while(n !=0)
        {
            if((n & 1 )==1)
            {
                count++;
            }
            k++;
            n = n >>1;
            if(count >1)
            {
                return false;
            }
        }
        if(k%2==1)
        {
            return true;
        }
        return false;
    }
}