class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        
        if nums is None:
            return False
        
        if len(nums) == 1:
            return nums[0] == target
        
        return self.searchNums(nums, target, 0, len(nums)-1, False)
    
    def searchNums(self, nums, target, begin, end, binary):
        """
        :type nums: List[int]
        :type target: int
        :type begin: int
        :type end: int
        :type binary: bool
        :rtype: bool
        """
        
        if nums is None or end - begin == -1:
            return False
        
        if end-begin == 0:
            return nums[begin] == target
        
        if end-begin == 1:
            if nums[begin] == target:
                return True
            else:
                return nums[end] == target
        
        mid = int((end - begin) / 2 + begin)
        
        if nums[mid] == target:
            return True
        
        pivotFound = nums[mid+1] < nums[mid-1]
        
        b1 = False
        b2 = False
        n1 = False
        n2 = False
        
        if pivotFound or binary:  

            if target >= nums[mid+1] and target <= nums[end]:
                b1 = self.searchNums(nums, target, mid+1, end, True)
            else:
                b2 = self.searchNums(nums, target, begin, mid-1, True)
                
        else:
            
            n1 = self.searchNums(nums, target, mid+1, end, binary)
            n2 = self.searchNums(nums, target, begin, mid-1, binary)
            
        return b1 or b2 or n1 or n2
        