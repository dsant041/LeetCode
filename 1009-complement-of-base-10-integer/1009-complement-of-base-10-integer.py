class Solution(object):
    def bitwiseComplement(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        if n == 0:
            return 1
        elif n == 1:
            return 0
        
        num = 0
        i = 0
        
        # convert to binary 
        
        while n > 0:
            
            
            num = num + 2 ** i * abs(n % 2 - 1)
            
            i+=1
            
            n = n / 2
    

        return num
    
        