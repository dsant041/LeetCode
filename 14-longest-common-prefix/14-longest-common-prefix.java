class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0)
            return "";
        
        //String prefix = strs[0];
        
        for (int i=0; i<strs[0].length(); i++){
            for (int j=1; j<strs.length; j++){
                
                if (strs[j].length() == i)
                    return strs[0].substring(0,i);
                
                if (strs[0].charAt(i) != strs[j].charAt(i))
                    return strs[0].substring(0,i);
                
            }
        }
        
        return strs[0];
        
    }
}