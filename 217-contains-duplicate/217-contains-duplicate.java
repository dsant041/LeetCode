class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /*
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1])
                return true;
        }
        */
        
        Set<Integer> map = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if (map.contains(nums[i]))
                return true;
            else
                map.add(nums[i]);
        }
        
        return false;
        
    }
}