class Solution {
    public int longestSubarray(int[] nums) {
        //it is same as the of consecutive one's just here k=1
        int maxLen=0, l=0, r=0, zeroes=0, len=0;
        while(r<nums.length){
            if(nums[r]==0)zeroes++;
            if(zeroes>1){
                if(nums[l]==0)zeroes--;
                l++;
            }
            if(zeroes<=1){
                len=r-l;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        return maxLen;
    }
}