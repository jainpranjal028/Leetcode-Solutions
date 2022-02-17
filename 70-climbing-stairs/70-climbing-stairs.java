class Solution {
    public int climbStairs(int n) {
        int tmp1=1;
        int tmp2=1;
        int cur=0;
        for(int i=2;i<=n;i++){
            cur=tmp1+tmp2;
            tmp1=tmp2;
            tmp2=cur;
        }
        return tmp2;
    }
}