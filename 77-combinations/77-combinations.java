class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        
        
        List<List<Integer>> allCombinations = new LinkedList<>();
        
        if (k>n || n<0)
            return allCombinations;
        
        if (k==0){
            allCombinations.add(new LinkedList<Integer>());
            return allCombinations;
        }
             

        if (k==n){
            List<Integer> single = new LinkedList<>();
            for (int i=1; i<=n; i++){
                single.add(i);
            }
            allCombinations.add(single);
            return allCombinations;
        }
        
        allCombinations = combine(n-1,k-1);
        
        for (List<Integer> combination : allCombinations){
            combination.add(n);
        }
        
        allCombinations.addAll(combine(n-1,k));
        
        
        /*
        if (k==1){
            for (int i=1; i<=n; i++){
                List<Integer> single = new LinkedList<>();
                single.add(i);
                allCombinations.add(single);
            }
            return allCombinations;
        }
        */
        
        return allCombinations;
        
    }
}