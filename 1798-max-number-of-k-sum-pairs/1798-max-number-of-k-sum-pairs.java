class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> result=new HashMap<>();
        // hashmap to store value
        //and number of times they have not been used to find the sum = k

        int count=0; //to count the number of pairs have sum equal to k
        
        for(int i=0;i<nums.length;i++) 
        {
            //take difference of k and current index value to store in target
            int target=k-nums[i];

            //check if target is there in map and 
            //if the no. of count it has not been used is greater than 0
            //then increase count by 1 and decrease the number of that
            //value not used by 1
            if(result.containsKey(target) && result.get(target)>0){
                count++;
                result.put(target,result.getOrDefault(target,0)-1);
            }

            //otherwise we put the current index value to map
            //and increase the number of not used by 1 or
            //if it already exits then incrase not used number by 1
            else
            {
                result.put(nums[i],result.getOrDefault(nums[i],0)+1);
            }
        }

        //and in the end we returns the count
        return count;
        
    }
}