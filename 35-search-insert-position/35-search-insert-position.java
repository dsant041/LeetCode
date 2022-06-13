class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if (target<nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        
        return searchInsert(nums, target, 0, nums.length-1); 

    } 

 

    int searchInsert(int[] nums, int target, int start, int end){ 

 

        if (start == end){ 



            if (nums[start] == target) 

                return start; 

            else if (nums[start] < target) 

                return start+1; 

            else 

                return start; 



        } 



        int mid = ((end - start) / 2) + start; 



        if (nums[mid] == target) 

            return mid; 



        if (target > nums[mid]) { 
            if (target < nums[mid+1])
                return mid+1;
            else
                return searchInsert(nums, target, mid+1, end); 
        }

        else  {
            if (target > nums[mid-1])
                return mid;
            else
                return searchInsert(nums, target, start, mid); 
        }





    } 
}