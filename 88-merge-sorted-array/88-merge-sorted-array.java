class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // numbers end of each array
        int nums1end = m-1;
        int nums2end = n-1;
        
        // true end of nums1
        int end = nums1.length-1;
        
        while (end >= 0){
            
            if (nums1end == -1){
                nums1[end] = nums2[nums2end];
                end--;
                nums2end--;
            }
            else if (nums2end == -1){
                nums1[end] = nums1[nums1end];
                end--;
                nums1end--;
            }
            
            else{
                
                if (nums1[nums1end] > nums2[nums2end]){
                    nums1[end] = nums1[nums1end];
                    end--;
                    nums1end--;
                }
                else{
                    nums1[end] = nums2[nums2end];
                    end--;
                    nums2end--;
                }
                
            }
            
        }
        
    }
}