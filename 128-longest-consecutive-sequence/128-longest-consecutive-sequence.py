class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        # create dict
        nums_dict = set()
        
        # add nums to dict
        for n in nums:
            
            nums_dict.add(n)
            
        # keep track of max length found
        max = 0
        
        for key in nums:
            
            
            
            if key in nums_dict:
            
                length = 1 
                curr_key = key + 1

                while curr_key in nums_dict:
                    length+= 1
                    nums_dict.remove(curr_key) 
                    curr_key+=1

                curr_key = key - 1

                while curr_key in nums_dict:
                    length+=  1
                    nums_dict.remove(curr_key)
                    curr_key -=1

                if length > max:
                    max = length
                    
                
           

        return max
        
        