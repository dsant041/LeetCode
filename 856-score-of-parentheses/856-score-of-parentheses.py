class Solution(object):
    def scoreOfParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        stack = []
        
        
        for l in s:
            stack.append(l)
            
            
            
        while len(stack) > 1:
            
            temp = []
            
            while len(stack) > 0 and stack[-1] != '(':
                
                temp.append(stack.pop())
                
            print(stack)
            print(temp)
            print()
                
            if len(stack) > 0 and len(temp) > 0 and stack[-1] == '(' and temp[-1] == ')':
                
                stack.pop()
                temp.pop()
                temp.append(1)
                
                print(len(stack))
                print(stack)
                print(temp)
                print()
                
            elif len(temp) > 0 and temp[-1] != '(' and temp[-1] != ')':
                
                num = temp.pop()
                

                if len(stack) > 0 and len(temp) > 0 and stack[-1] == '(' and temp[-1] == ')':
                
                    stack.pop()
                    temp.pop()
                    temp.append(num*2)
                    
                    print(len(stack))
                    print(stack)
                    print(temp)
                    print()
                
                elif len(temp) > 0 and temp[-1] != '(' and temp[-1] != ')':
                    
                    num2 = temp.pop()
                    temp.append(num+num2)
                    
                    print(len(stack))
                    print(stack)
                    print(temp)
                    print()
                    
            else:
                
                if len(temp) > 0 and temp[-1] != '(' and temp[-1] != ')':
                    
                    num = temp.pop()
                    
                    if len(temp) > 0 and temp[-1] != '(' and temp[-1] != ')':
                        
                        num2 = temp.pop()
                        temp.append(num+num2)
                
                
                
            while len(temp) > 0:
                
                stack.append(temp.pop())
                
            if len(stack) == 1:
                return stack[0]
            
        
            
        #print(stack)
        
        return stack[0]