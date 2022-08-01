class Solution {
    public int removeDuplicates(int[] nums) {
        
        int end = 0;
        int curr = 1;
        
        if (nums.length == 1)
            return 1;
        
        while (curr < nums.length){
            
            if (nums[end] == nums[curr]){
                curr++;
            }
            
            else{
                end++;
                nums[end] = nums[curr];
                curr++;
            }
            
        }
        
        return end+1;
        
    }
}