class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int end = numbers.length - 1;
        while(left < end)
        {
            int sum = numbers[left] + numbers[end];
            if(target == sum) return new int[]{left+1, end+1};
            else if(sum>target)end--;
            else if(sum<target)left++;
        }
        return new int[]{-1,-1};
        
    }
}