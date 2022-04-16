class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if (cost == null || cost.length == 0)
            return 0;
        
        if (cost.length==1)
            return cost[0];
        
        int [] pay = new int[cost.length];
        
        pay[0] = cost[0];
      //  pay[1] = cost[1];
        
        for (int i=1; i<pay.length;i++){
            
            if (i>1)
                pay[i] = Math.min(pay[i-1],pay[i-2]) + cost[i];
            else
                pay[i] = Math.min(pay[i-1] + cost[i],cost[i]);
            
            
        }
            
        
        return pay[cost.length-1] < pay[cost.length-2]?  pay[cost.length-1]: pay[cost.length-2];
    }
}