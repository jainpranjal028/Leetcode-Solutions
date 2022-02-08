class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) 
            if (isPrime(getCount(i)))
                count++;
        return count;
        
    }
     static int getCount(int n) {
        int count = 0;
        while (n > 0) {
            // count++;
            // n -= n & (-n);
            if((n & 1)==1)
                {
                    count++;
                }
                n=n>>1;
        }
        return count;
    }
     static boolean isPrime(int n) {
        if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true; 
    }
}