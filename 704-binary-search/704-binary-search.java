
class Solution {
    public int search(int[] nums, int target) {
        int[] index = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            index[i] = i;
        }

        return search(nums,index,target);
        
    }
    
    public int search(int[] nums, int[] index, int target){
    
                
        int index1 = 0;
        int index2 = 0;
        
        if (nums.length == 1){
            if (nums[0]==target) return index[0];
            else return -1;
        }
        else if (nums.length == 2){
            if (nums[0]==target) return index[0];
            else if (nums[1]==target) return index[1];
            else return -1;
        }

        else if (nums.length%2 == 0){
            index1 = search(subArray(nums,0,nums.length/2),
                   subArray(index,0,index.length/2),target);
            index2 = search(subArray(nums,nums.length/2,nums.length),
                   subArray(index,index.length/2,index.length),target);
        }
        else {
            index1 = search(Arrays.copyOfRange(nums,0,nums.length/2),
                   Arrays.copyOfRange(index,0,index.length/2),target);
            index2 = search(Arrays.copyOfRange(nums,nums.length/2,nums.length),
                   Arrays.copyOfRange(index,index.length/2,index.length),target);
        }
        
        if (index1 > -1) return index1;
        else return index2;
    }
    
    public int[] subArray (int[] arr, int start, int end){
        int[] newArr = new int [end-start];
        for (int i=0; i<newArr.length;i++){
            newArr[i] = arr[start];
            start++;
        }
        return newArr;
    }

}