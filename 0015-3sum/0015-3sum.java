class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<nums.length || nums==null)return new ArrayList<>();
        //Sort the arrya
        Arrays.sort(nums);

        //for the result to be stored
        Set<List<Integer>> result=new HashSet<>();
        
        //we select the first fixed element
        //we'll move till the i is less than nums.lenght-1 
        //bcoz in the end there will be three nums only and we can't find
        //triplet afterwards 
        
        for(int i=0;i<nums.length-2;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(sum>0)r--;
                else l++;
            }
        }
        return new ArrayList<>(result);
        
    }
}