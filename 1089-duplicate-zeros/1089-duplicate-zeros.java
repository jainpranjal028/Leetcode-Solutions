class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] ==0) {
                int j;
                for(j = n-2; j>=i+1; j--) {
                    arr[j+1] = arr[j];
                }
                arr[j+1] = 0;
                i++;
            }
        }
    }
}