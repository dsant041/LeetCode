class Solution {
    public boolean isPalindrome(String s) {
        
        if (s == null || s.length() == 0)
            return true;
        
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        
        int start = 0;
        int end = s.length()-1;
        
        
        
        System.out.println(s);
        
        while (start <= end){
            
            
            
            if (s.charAt(start) != s.charAt(end))
                return false;
            
            start++;
            end--;
            
        }
        
        
        return true;
        
    }
}