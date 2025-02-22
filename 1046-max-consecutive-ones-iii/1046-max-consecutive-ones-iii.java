class Solution {
    public int longestOnes(int[] nums, int k) {
        //we maxLen for maximum no. of 1 in window
        //zeroes to have a count of no. of zeroes in windows
        //l and r are the start and end point of the window
        int maxLen=0, zeroes=0, l=0, r=0;

        //we loop through the array till r < length of array nums
        while(r<nums.length)
        {
            int len=0;//for comparing with maxLen

            //if the nums[r] is the 0 then we increase the zeroes by 1
            if(nums[r]==0)zeroes++;

            //now if number of zeroes exceeds k
            if(zeroes>k){
                //if the nums[l] is 0 then we decrease the number of zeroes
                //by 1
                if(nums[l]==0)zeroes--;
                //increase the starting point of window by 1 
                //until the number of zeroes gets equal to k
                l++;
            }

            //if number of zeroes is less than k
            if(zeroes<=k){
                //we update the len
                //and compare it with maxLen
                len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        return maxLen;
        
    }
}