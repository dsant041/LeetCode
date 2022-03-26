class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        n = len(nums)
        
        missing = []
        
        for i in range(0,n):
            
            missing.append(True)
            
        for i in range(0,n):
            
            missing[nums[i]-1] = False
            
        output = []
        
        for i in range(0,n):
            
            if missing[i] == True:
                
                output.append(i+1)
                
        return output