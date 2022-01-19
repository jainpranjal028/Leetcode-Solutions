class Solution {
    
    public int firstOccurence(int[] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;
        int first = -1;
        while(start <= end)
        {
            if(nums[mid] == target)
            {
                first = mid;
                end = mid -1;
            }
            else if(nums[mid] > target)
            {
                end =  mid - 1;
                
            }
            else
            {
                start = mid +1 ;
            }
            
            mid = start + (end - start)/2;
        }
        return first;
    }
        
     public int lastOccurence(int[] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;
        int last = -1;
        while(start <= end)
        {
            if(nums[mid] == target)
            {
                last = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target)
            {
                end =  mid - 1;
                
            }
            else
            {
                start = mid +1 ;
            }
            
            mid = start + (end - start)/2;
        }
         return last;
    }

        public int[] searchRange(int[] nums, int target) {
        
        int[] answer = new int[2];
        
        answer[0] = firstOccurence(nums,target);
        answer[1] = lastOccurence(nums,target);
        
        return answer; 
        
    }
}