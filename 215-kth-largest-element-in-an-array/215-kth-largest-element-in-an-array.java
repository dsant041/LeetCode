class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        if (nums == null || nums.length == 0)
            return 0;
        
        if (k>nums.length || k<1)
            return 0;
        
        
        // sorting then returning length-k
        /*
        Arrays.sort(nums);
        
        return nums[nums.length-k];
        */
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i=0; i<nums.length; i++){
            maxheap.add(nums[i]);
        }
        
        while (k>1){
            
            maxheap.poll();
            k--;
            
        }
        
        return maxheap.poll();
        
    }
}