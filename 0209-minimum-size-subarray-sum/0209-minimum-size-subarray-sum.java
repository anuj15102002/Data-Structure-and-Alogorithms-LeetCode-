class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;

        while(high<nums.length){
            sum += nums[high];
            high++;

            while(sum >= target){
                int currentWindow = high - low;
                minWindow = Math.min(minWindow, currentWindow);

                sum = sum - nums[low];
                low++;
            }
        }
        return minWindow == Integer.MAX_VALUE?0:minWindow;
        
    }
}