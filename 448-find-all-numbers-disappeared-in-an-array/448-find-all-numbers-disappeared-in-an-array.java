class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
         for(int i = 0;i<nums.length;i++){
            int val = Math.abs(nums[i]);
            nums[val -1] = nums[val - 1] < 0 ? nums[val - 1] : -1 * nums[val - 1];
        }
        
        List<Integer> list  = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0) list.add(i + 1);
        }
        
        return list;
        
    }
}