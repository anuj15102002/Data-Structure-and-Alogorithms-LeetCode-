class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        //first we find total sum nums
        
        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        
        int leftSum=0;

        for(int i=0;i<nums.length;i++){
            //first we check totalSum-leftSum is equal to leftSum or not
            totalSum-=nums[i];

            if(leftSum==totalSum)return i;
            

            //now we calculate leftSum
            leftSum+=nums[i];
        }
        return -1;
    }
}