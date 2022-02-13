class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        Arrays.sort(nums);
        int result=sum-(nums.length*nums[0]);
        result%=1000000007;
        return result;
    }
}