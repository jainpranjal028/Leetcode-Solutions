class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //if given k is -ve
        // if(k<0)
        //     k = k+n;
        
        //part-1
        reverse(nums,0,n-k-1);
        
        //part -2
        reverse(nums,n-k,n-1);
        
        
        //part -3
        reverse(nums,0,n-1);
        
        
    }
    
    public void reverse(int[] arr,int i,int j){
        int l = i;
        int r = j;
        
        while(l<r){
            int tmp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = tmp;
        }
    }
}