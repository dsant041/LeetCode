class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if (nums.length == 2)
            return new int[]{0,1};
        
        Map<Integer,Integer> map = new HashMap<>();
        
        //key = nums[i]
        //value = i
        
        for (int i=0;i<nums.length;i++){
            
            if (map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
            else
                map.put(nums[i],i);
            
        }
        
        return null;
        
        /*
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1; j<nums.length;j++){
                
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        
        return null;
        */
                
        
        
    }
}