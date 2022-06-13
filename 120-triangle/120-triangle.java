class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
                //check if the triangle is not empty 



        int [] minPath = new int[triangle.size()+1]; 



        //MinPath[0] = triangle.get(0).get(0); 



        //start at last row 

        for (int j = triangle.size()-1; j >=0; j--){ 



            // go through each element of row 

            for (int k=0; k<triangle.get(j).size();k++){ 



                minPath[k] = Math.min(minPath[k],minPath[k+1]) + triangle.get(j).get(k); 
                



            } 
            
        } 



        return minPath[0]; 
        
    }
}