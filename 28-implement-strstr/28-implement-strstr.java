class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0)
            return 0;
        if (needle.length() > haystack.length())
            return -1;
        
        if (needle.length() == haystack.length()){
            for (int j=0; j<needle.length(); j++){
                if (needle.charAt(j) != haystack.charAt(j)){
                    return -1;
                }
            }
            return 0;
        }
            
        
        for (int i=0; i<haystack.length()-needle.length()+1;i++){
            
            if (haystack.charAt(i) == needle.charAt(0)){
                
                int curr = i;
                boolean same = true;
                for (int j=0; j<needle.length(); j++){
                    if (needle.charAt(j) != haystack.charAt(curr)){
                        same = false;
                        break;
                    }
                    curr++;
                }
                if (same)
                    return i;
            }
                
            
        }
        
        return -1;
        
    }
    
    
}