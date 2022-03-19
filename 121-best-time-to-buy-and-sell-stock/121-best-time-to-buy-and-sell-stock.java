class Solution {
    public int maxProfit(int[] prices) {
        
                
        int min = 0;
        
        int diff = 0;
        
        for (int i=1; i<prices.length;i++){
            
            if (prices[i] < prices[min]){
                min = i;
            }
            
            else if (prices[i] > prices[min] && prices[i] - prices[min] > diff)
                diff = prices[i] - prices[min];
            
        }
        
        return diff;
        
    }
}