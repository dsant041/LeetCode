class Solution {
    public boolean isHappy(int n) {
        
        if (n==1)
            return true;
        
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        
        boolean happy = false;
        int num = n;
        System.out.println(num);
        
        while (!happy){
            
            int currSum = 0;
            while (num > 0){
                
                System.out.println(num % 10);
                
                currSum+= Math.pow(num % 10,2);
                
                num = num/10;
                
                
            }
            System.out.println(currSum + "\n");
            
            if (set.contains(currSum))
                return false;
            else
                set.add(currSum);
            
            if (currSum == 1){
                happy = true;
                return true;
            }
            
            if (n == num)
                return false;
            
            num = currSum;
            
        }
        
        return false;
    }
}