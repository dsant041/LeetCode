class Solution {
    public int maxSubArray(int[] nums) {
        
        if (nums.length == 1)
            return nums[0];
        
        int max = nums[0];
        
        int total = nums[0];
        boolean t = true;
        
        int total2 = 0;
        boolean t2 = false;
        
        
        for (int i = 1; i< nums.length; i++){
            
            total = total + nums[i];
            total2 = total2 + nums[i];
            
            
            t = true;
             t2 = true;
            
           
            
            if (total > total2){
                total2 = 0;
                t2 = false;
            }
            else{
                total = 0;
                t = false;
            }
            
             if (t && total > max)
                max = total;
            else if (t2 && total2 > max)
                max = total2;
        }
        
        if (t && total > max)
                max = total;
            else if (t2 && total2 > max)
                max = total2;
        
        return max;
        
        
    }
}