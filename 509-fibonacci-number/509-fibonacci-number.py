class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <=1:
            return n
        f = 0
        f1 = 0
        f2 = 1
        
        
        
        for i in range(2,n+1):
            
            f = f1 + f2
            f1 = f2
            f2 = f
            
        
        return f