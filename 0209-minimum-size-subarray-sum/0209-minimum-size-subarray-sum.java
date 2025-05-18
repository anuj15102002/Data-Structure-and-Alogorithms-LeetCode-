class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int x = 0;
        int sum = 0;

        for(int y=0;y<nums.length;y++)
        {   
            sum += nums[y];
            while(sum >= target)
            {
                min = Math.min(y - x + 1, min);
                sum -= nums[x];
                x++;
            }
        }
        
        if(min == Integer.MAX_VALUE) return 0;
        return min;
        
    }
}