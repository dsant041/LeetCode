class Solution {
    public String getSmallestString(int n, int k) {
        
        String smallestString = "";
        
        if (n==1)
            return smallestString + (char) (k + 'a' - 1);
        
        int max = 26;
        
        char[] smallestChars = new char[n];
        
        for (int i=0; i<n; i++){
            smallestChars[i] = 'a';
        }
        
        k = k-n;
        
        int end = n-1;
        
        while (k>0){
            
            smallestChars[end] = (char) (Math.min(max,k+1) + 'a' - 1);
            
            k-=max-1;
            end--;
            
        }
        
        return String.valueOf(smallestChars);
        
        /*
        
        while ((k-n+1)-max >= max){
            smallestString = 'z' + smallestString;
            k -= 26;
            n--;
        }
        
        
        while (n>0 && n!=k){
            
            smallestString = (char) (Math.min(k - n + 1, max) + 'a' - 1) + smallestString;
            k -= Math.min(k - n + 1, max);
            
            n--;
            
        }
        
        while (n>0){
            smallestString = 'a' + smallestString;
            n--;
        }
        
        
        return smallestString;
        */
        
    }
}