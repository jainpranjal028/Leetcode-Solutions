class Solution {
    public int fib(int n) {
        
        if(n==0||n==1)
        {
            return n;
        }
        
        int f1 = 0;
        int f2 = 1;
        int fib = f1+f2;
        for(int i=2; i<=n; i++)
        {
            fib=f1+f2;
            f1=f2;
            f2=fib;
        }
        return fib;
    }
}