class Solution {
    public int[] sortedSquares(int[] nums) {
        
        if (nums == null || nums.length == 0)
            return nums;
        
        if (nums.length == 1){
            nums[0] = nums[0] * nums[0];
            return nums;
        }
        
        int start = 0;
        int end = nums.length-1;
        
        int[] sorted = new int[nums.length];
        
        for (int i =0; i<nums.length; i++){
            
            if (nums[end] * nums[end] >= nums[start] * nums[start]){
                sorted[nums.length - i - 1] = nums[end] * nums[end];
                
                end--;
                
            }
            else{
                sorted[nums.length - i - 1] = nums[start] * nums[start];
                
                start++;
                
            }
            
           
            
            
            
        }
        
            
        return sorted;
        
    }
}