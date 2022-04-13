class Solution {
    public int distributeCandies(int[] candyType) {
        
        if (candyType == null)
            return 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        int difftypes = 0;
        
        for (int i=0; i<candyType.length; i++){
            
            if (!set.contains(candyType[i])){
                set.add(candyType[i]);
                difftypes++;
            }
                
            if (difftypes == candyType.length/2)
                return difftypes;
            
        }
        
        return difftypes;
        
    }
}