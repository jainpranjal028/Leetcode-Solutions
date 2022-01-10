class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int s=1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                s=s+i+num/i;
                if(i==num/i)
                {
                    s=s-i;
                }
            }
        }
        return s==num && num>1;
    }
}