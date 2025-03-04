class Solution {
    public int longestConsecutive(int[] nums) {

        int maxLen=0;
        Map<Integer,Boolean> map=new HashMap<>();

        //putting false against every number at the start
        for(int num:nums)
        {
            map.put(num,Boolean.FALSE);
        }  

        //now traverse the array
        for(int num:nums)
        {
            int currentLen=1;

            //check in forward direction
            int nextNum=num+1;
            while(map.containsKey(nextNum) && map.get(nextNum)==false)
            {
                map.put(nextNum,Boolean.TRUE);
                //incrase the nextNum by 1
                nextNum++;
                //increase the current length
                currentLen++;
            }

            //check in backward direction
            int prevNum=num-1;
            while(map.containsKey(prevNum) && !map.get(prevNum))
            {
                map.put(prevNum,Boolean.TRUE);
                prevNum--;
                currentLen++;
            }

            maxLen=Math.max(maxLen,currentLen);
        }
        return maxLen;
        
    }
}