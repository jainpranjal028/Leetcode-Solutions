class Solution {
public int[] numMovesStones(int a, int b, int c) {
    int ans[] = new int[2];
    int arr[] = {a, b, c};
    Arrays.sort(arr);
    a = arr[0];
    b = arr[1];
    c = arr[2];
    
    if(a+1 == b && b+1 == c)
        ans[0] = 0;
    else if(a+2 == b || b+2 == c || a+1==b || b+1==c)
        ans[0] = 1;
    else 
        ans[0] = 2;
    
    ans[1] = Math.abs(c-a+1-3);
    
    return ans;
}
}