class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        if (nums == null || nums.length == 0)
            return 0;
        
        if (k>nums.length || k<1)
            return 0;
        
        Arrays.sort(nums);
        
        return nums[nums.length-k];
        
    }
}