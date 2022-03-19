class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        
        int mid = (arr.length-1)/2;
        
        while (mid < arr.length && mid > 0){
            
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
                return mid;
            
            if (arr[mid] < arr[mid+1])
                mid++;
            else
                mid--;
                
            
        }
        
        return mid;
        
    }
}