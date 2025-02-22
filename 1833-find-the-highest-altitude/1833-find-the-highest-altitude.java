class Solution {
    public int largestAltitude(int[] gain) {
        //we take two variable 
        //cumulative sum mean sum of all previous index values
        int maxA=0;
        int currentA=0;
        for(int i=0;i<gain.length;i++)
        {
            currentA+=gain[i];
            maxA=Math.max(maxA,currentA);
        }
        return maxA;
        
    
    }
}