class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> permutations = new LinkedList<>();
        
        
        
        if (nums.length == 1){
            List<Integer> single  = new LinkedList<>();
            single.add(nums[0]);
            permutations.add(single);
            return permutations;
        }
        
        for (int i=0; i<nums.length;i++){
            int[] subNums = new int[nums.length-1];
            int numsIndex = 0;
            int j=0;
            while (j<subNums.length){
                if (numsIndex != i){
                    subNums[j] = nums[numsIndex];
                    j++;
                }
                numsIndex++;
                //j++;
            }
            System.out.println(nums[i]);
            System.out.println(Arrays.toString(subNums));
            System.out.println();
            List<List<Integer>> subPermutations = permute(subNums);
            for (List<Integer> subPer : subPermutations){
                subPer.add(nums[i]);
            }
            permutations.addAll(subPermutations);
        }
        
        
        return permutations;
        
    }
}