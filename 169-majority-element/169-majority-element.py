class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if nums is None:
            return 0
        
        if len(nums) == 1:
            return nums[0]
        
        curr = nums[0]
        counter = 1
        
        for i in range(1,len(nums)):
            
            if counter > 0:
                
                if nums[i] == curr:
                    counter += 1
                else:
                    counter -= 1
            
            else:
                
                curr = nums[i]
                counter += 1
                
        return curr
        
        