class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 0 ,dec =0;
        for(int i=0;i<nums.length-1;i++)
       {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
           else if(nums[i]<nums[i+1])
           {
                inc++;
            }
           else
           {
                dec++;
           }
      }
        if(inc>0 && dec>0)return false;
        
        return true;
    }
}