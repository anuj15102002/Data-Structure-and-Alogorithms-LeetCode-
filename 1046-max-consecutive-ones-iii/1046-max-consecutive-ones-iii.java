class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0, l=0, r=0, zeroes=0;
        while(r<nums.length){
            int len;
            if(nums[r]==0)zeroes++;
            if(zeroes>k)
            {
                if(nums[l]==0)zeroes--;
                l++;
            }
            if(zeroes<=k){
                len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;

        }
        return maxLen;
    }
}