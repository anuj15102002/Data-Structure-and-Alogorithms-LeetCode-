class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen=0, l=0, r=0, zeroes=0;
        while(r<nums.length)
        {
            int len;
            if(nums[r]==0)zeroes++;
            if(zeroes>1)
            {
                if(nums[l]==0)zeroes--;
                l++;
            }
            if(zeroes<=1)
            {
                len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        return maxLen-1;
    }
}