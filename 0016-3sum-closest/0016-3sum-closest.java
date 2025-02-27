class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum=nums[0]+nums[1]+nums[2];
        int minDifference=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            int l=i+1, r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[r]+nums[l];
                if(sum==target)return target;
                else if(sum>target)r--;
                else l++;
                
                //here we checking the which triplet sum is closest to target
                int diffToTarget=Math.abs(sum-target);

                //and comparing with other triplet's sum
                if(diffToTarget<minDifference)
                {
                    //replacing resultSum with sum if it is closest to target
                    resultSum=sum;
                    //replacing minDifference with diffToTarget if it 
                    //closest to target
                    minDifference=diffToTarget;
                }
            }
            
        }
        //returning the closest triplet sum to the target
        return resultSum;
    }
}