class Solution {
    //Function to Print the Self Dividing Numbers
    public List<Integer> selfDividingNumbers(int a, int b) {
         ArrayList<Integer> list=new ArrayList<>();
        for (int i = a ;i <= b; i++) {
            if(check(i)) list.add(i);
        }
        return list;
    }
    //Function to Check Whether a Numebr is Self-Dividing
    private static boolean check(int x) {
        int tem=x;
       while(tem>0){//We're simultaneoulsy checking whether a digit is 0 and whether that digit divides the number
           if(tem%10==0)return false;
           if(x%(tem%10)!=0)return false;
           tem/=10;
       }
       return true;
    }
}