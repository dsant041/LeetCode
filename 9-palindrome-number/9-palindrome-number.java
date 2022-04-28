class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0)
            return false;
        
        if (x<10)
            return true;
        
        int numDigits = 0;
        int temp = x;
        
        while (temp>0){
            temp/=10;
            numDigits++;
        }
        
        temp = x;
        
        while (temp>0){
            
            int left =  (int)(temp/(Math.pow(10,numDigits-1)));
            int right = (int)(temp % 10);
            //System.out.println(temp);
           // System.out.println(left);
           // System.out.println(right);    
            
            temp = (int)(temp % (Math.pow(10,numDigits-1)));
           // System.out.println(temp);
            temp = temp/10;
          //  System.out.println(temp);
            numDigits-=2;
          //  System.out.println(); 
            
            if (left != right)
                return false;
        }
        
        //System.out.println(x/(Math.pow(10,numDigits-1)));
        //System.out.println(x % (Math.pow(10,1)));
        
        /*
        for (int i=1; i<numDigits/2;i++){
            
            int left =  (int)(temp/(Math.pow(10,numDigits-i)));
            int right = (int)(temp % (Math.pow(10,i)));
            temp = (int)(temp % (Math.pow(10,numDigits-i)));
            //temp/=10;
                             
            System.out.println(left);
            System.out.println(right);    
            System.out.println();    
                             
            if (left != right)
                return false;
            
        }
        
        */
        return true;
        
    }
}