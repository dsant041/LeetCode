class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // numbers end of each array
        m--;
        n--;
        
        // true end of nums1
        int end = nums1.length-1;
        
        while (end >= 0){
            
            if (m == -1){
                nums1[end] = nums2[n];
                end--;
                n--;
            }
            else if (n == -1){
                nums1[end] = nums1[m];
                end--;
                m--;
            }
            
            else{
                
                if (nums1[m] > nums2[n]){
                    nums1[end] = nums1[m];
                    end--;
                    m--;
                }
                else{
                    nums1[end] = nums2[n];
                    end--;
                    n--;
                }
                
            }
            
        }
        
    }
}