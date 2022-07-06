class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        f = 0
        f1 = 0
        f2 = 1
        
        for i in range(2,n+1):
            
            f = f1 + f2
            f1 = f2
            f2 = f
            
        if n <=1:
            return n
        else:
            return f