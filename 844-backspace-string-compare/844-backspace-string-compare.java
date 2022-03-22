class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        if (s.length()==1 && t.length() == 1)
            return s.equals(t);
        
        int backspaceS = 0;
        int backspaceT = 0;
        
        int indexS = s.length()-1;
        int indexT = t.length()-1;
        
        while (indexS >= 0 || indexT >= 0){
            
            
            
                while (indexS>=0 && (s.charAt(indexS) == '#' || backspaceS >0)){

                    
                    if (s.charAt(indexS) == '#')
                        backspaceS++;
                    else
                        backspaceS--;
                    
                    indexS--;

                }
             
           
            
                 while (indexT>=0 && (t.charAt(indexT) == '#' || backspaceT >0)){

                    
                    if (t.charAt(indexT) == '#')
                        backspaceT++;
                    else
                        backspaceT--;
                     
                     indexT--;

                }
             
            
            
            
            if (indexS >= 0 ^ indexT >= 0)
                return false;
            if (indexS >= 0 && indexT >=0 && s.charAt(indexS) != t.charAt(indexT))
                return false;
            
            
            indexS--;
            indexT--;
            
            
            
        }
        
      //  System.out.println(s.substring(0,indexS));
       // System.out.println(t.substring(0,indexT));
   
      
            return true;
        
    }
}