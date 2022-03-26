

class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        if nums is None or len(nums) == 0:
            return -1;
        
        if len(nums) == 1:
            if nums[0] == target:
                return 0
            else:
                return -1
        
        return self.searchNums(nums, 0, len(nums)-1, target)
    
    def searchNums(self, nums, begin, end, target):
        
        """
        :type nums: List[int]
        :type target: int
        :type begin: int index
        :type end: int index
        :rtype: int
        """
        
        if nums is None or end-begin == -1:
            return -1;
        
        if end-begin == 0:
            if nums[begin] == target:
                return begin
            else:
                return -1
        
        if end-begin == 1:
            if nums[begin] == target:
                return begin
            elif nums[end] == target:
                return end
            else:
                return -1
                
        if nums[(end-begin)/2+begin] == target:
            return (end-begin)/2+begin
        elif nums[(end-begin)/2+begin] > target:
            return self.searchNums(nums, begin, (end-begin)/2+begin-1, target)
        else:
            return self.searchNums(nums, (end-begin)/2+begin, end, target)