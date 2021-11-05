class Solution {
    public int arrangeCoins(int n) {
        
        
        int k = 0;
        
        int complete = 0;
        
        boolean full = true;
        
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        //int left = n;
        
        while (full){
            
            k++;
            n = n-k;
            
            if (n<0)
                full = false;
            else
                complete++;
                
        }
        
        return complete;
        
    }
}