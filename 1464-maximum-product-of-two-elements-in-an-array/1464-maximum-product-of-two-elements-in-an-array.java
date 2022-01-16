class Solution {
    public int maxProduct(int[] nums) {
     
        int max=0;
        int secondmax=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] >= max)
            {
                secondmax = max;
                max = nums[i];
                
            }
            else if (nums[i] > secondmax) {
                secondmax = nums[i];
            }
        }
        
        int result = (max - 1 ) * (secondmax - 1 );
        return result;
        
    }
}