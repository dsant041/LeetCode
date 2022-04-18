class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s == null || t == null)
            return true;
        
        if (s.length() != t.length())
            return false;
        
        if (s == "" && t == "")
            return true;
        
        int [] alphabet = new int[26];
        
        for (int i=0; i<s.length(); i++){
            
            try{
            alphabet[s.charAt(i) - 'a']++;
            }
            catch (ArrayIndexOutOfBoundsException e){
                return false;
            }
            
        }
        
        
        for (int i=0; i<t.length(); i++){
            
            try{
            alphabet[t.charAt(i) - 'a']--;
                }
            catch (ArrayIndexOutOfBoundsException e){
                return false;
            }
            
        }
        
        
        for (int i=0; i<alphabet.length; i++){
            
            if (alphabet[i] != 0 )
                return false;
            
        }
        
        return true;
        
    }
}