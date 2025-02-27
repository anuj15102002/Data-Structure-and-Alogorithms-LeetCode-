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

                int diffToTarget=Math.abs(sum-target);
                if(diffToTarget<minDifference)
                {
                    resultSum=sum;
                    minDifference=diffToTarget;
                }
            }
            
        }
        return resultSum;
    }
}