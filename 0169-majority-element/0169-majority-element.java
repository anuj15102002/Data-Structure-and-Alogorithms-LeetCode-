class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>len/2)
            {
                return n;
            }
            
        }
        return -1;


        // for(int n:nums)
        // {
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry: map.entrySet())
        // {
        //     if(entry.getValue()>nums.length/2)
        //     {
        //         return entry.getKey();
        //     }

        // }
        // return -1;
        
    }
}