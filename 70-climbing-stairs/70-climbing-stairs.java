class Solution {
    public int climbStairs(int n) {
        
        if (n==0)
            return 0;
        
        int [] distinct = new int[n+1];
        
        distinct[0] = 0;
        distinct[1] = 1;
        
        if (n==1)
            return 1;
        
        for (int i = 2; i<=n; i++){
            
            distinct[i] = distinct[i] + distinct[i-1] + distinct[i-2];
            
        }
        
        
        return distinct[n] + distinct[n-1];
        
    }
}