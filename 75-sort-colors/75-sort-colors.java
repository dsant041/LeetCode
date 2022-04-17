class Solution {
    public void sortColors(int[] nums) {
        // move 0s to front and 2s to back
        
        
        if (nums == null || nums.length == 0)
            return;

        int index = 0;
        int index0 = -1;
        int index2 = nums.length;

        while (index < index2){

            if (nums[index] == 0){
                int temp = nums[index];
                nums[index] = nums[index0+1];
                nums[index0+1] = temp;
                index0++;
                if (index == index0)
                    index++;
            }
            else if (nums[index] == 2){
                int temp = nums[index];
                nums[index] = nums[index2-1];
                nums[index2-1] = temp;
                index2--;
            }
            else{
                index++;
            }
		
        }
    }
}