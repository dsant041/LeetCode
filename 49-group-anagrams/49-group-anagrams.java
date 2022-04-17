class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> allAnagrams = new LinkedList<List<String>>();

        if (strs == null || strs.length == 0)
            return allAnagrams;

        String[] strsSorted = new String[strs.length];

        for (int i=0; i <strs.length; i++){
         /*   LinkedList<String> ana = new LinkedList<String>();
            ana.add(strs[i]);
            allAnagrams.add(ana);
            */
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            strsSorted[i] = new String(arr);
            //System.out.println(strsSorted[i]);
        }
        
        for (int i=0; i <strs.length; i++){
            
            if (strs[i] == null)
                continue;
            
            LinkedList<String> ana = new LinkedList<String>();
            ana.add(strs[i]);
            
            for (int j=i+1; j <strs.length; j++){
                
                if (strs[j] == null)
                continue;
                
                if (strsSorted[i].equals(strsSorted[j])){
                    ana.add(strs[j]);
                    strs[j] = null;    
                    }
                
            }
            
            
            
            allAnagrams.add(ana);
            
            
        }
        
           return allAnagrams; 
            
        
            /*
            int index = 0;

            while (index < allAnagrams.size()){
                
                List<String> curr = allAnagrams.get(index);

                String current = curr.get(0);
                //System.out.println(current);

                int indexA = index+1;

                while (indexA <  allAnagrams.size()){
                    
                    List<String> currA = allAnagrams.get(indexA);

                    String possA = currA.get(0);
                    //System.out.println(possA);

                    if (compare(current,possA)){

                        List<String> toRemove = allAnagrams.remove(indexA);

                        curr.add(toRemove.remove(0));

                    }
                    else{
                        indexA++;
                    }
                }

                index++;
                //System.out.println();

            }
            return allAnagrams;

        }

        private boolean compare(String a, String b){
            
            if(a==null && b== null)
                return true;
            else if(a==null || b== null)
                return false;
            
            if (a == "" && b == "")
                return true;
            else if(a == "" || b == "")
                return false;

            char [] arrA = a.toCharArray();
            char [] arrB = b.toCharArray();
            
            Arrays.sort(arrA);
            Arrays.sort(arrB);

            String sortedA = new String(arrA);
        String sortedB = new String(arrB);

        return sortedA.equals(sortedB);
*/
        }

}