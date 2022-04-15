class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if (amount <1)
            return 0;
        
        if (coins == null || coins.length == 0)
            return 0;
        
        int [] total = new int[amount+1];
        
     //   for (int t=0;t<total.length;t++){
       //     total[t] = amount+1;
       // }
        
        total[0] = 0;
        //boolean addedcoin = false;
        for (int i=1; i<=amount;i++){
            
            total[i] = amount+1;
            //addedcoin = false;
            for (int j=0; j<coins.length; j++){
               /* 
                if (coins[j] == i){
                    total[i] = 1;
                    //addedcoin = true;
                    break;
                }
                else */if (coins[j] <= i){
                    
                /*    if(total[i-coins[j]]==-1)
                            break;
                
                    if (total[i]==0){
                        
                      //  if(total[i-coins[j]]==-1)
                       //     break;
                      //  else
                            total[i]=total[i-coins[j]]+1;
                        
                        if(coins[j]+i-1 > amount)
                            total[i]=0;
                        else
                            total[i]=total[i-coins[j]]+1;
                            
                        
                    }
                    
                    else*/
                        total[i] = Math.min(total[i],total[i-coins[j]]+1);
                    
                    //addedcoin = true;
                }
                
            }
         //   if(total[i]==0)
           //     total[i] = -1;
            
        }
        
      //  if(!addedcoin)
        //    return -1;
        
        return total[amount]>amount? -1:total[amount];

        
    }
}