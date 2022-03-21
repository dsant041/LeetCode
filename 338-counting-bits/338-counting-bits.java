class Solution {
    public int[] countBits(int n) {
        
        int [] numberOf1 = new int[n+1];
        
        numberOf1[0] = 0;
        

        for(int i=1; i<numberOf1.length;i++){
            
            boolean isEven = i%2 == 0;
            
            if (isEven){
                
                numberOf1[i] = numberOf1[i/2];
                
            }
            
            else{
                
                numberOf1[i] = 1 + numberOf1[i-1];
                
            }
            
        }
        
        
        /*
        for(int i=1; i<numberOf1.length;i++){
            
            int curr = i;
            
            while (curr>0){
                
                numberOf1[i] = numberOf1[i] + curr%2;
                curr/=2;
            }
            
        }
        
        */
        return numberOf1;
    }
}