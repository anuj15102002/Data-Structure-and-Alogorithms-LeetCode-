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
            //by this we'll have right sum of all the index after i
            totalSum-=nums[i];

            //here we leftSum before i index and rightSum after i index
            if(leftSum==totalSum)return i;
            

            //now we calculate leftSum so we have sum of all the values 
            //before i+1 for the next loop
            leftSum+=nums[i];
        }
        return -1;
    }
}

// in the loop we have the both leftSum of all the number before i index
//and rightSum of all the number after i index 
//leftSum is calulated after checking for the next loop
//rightSum is calculated at the start of the loop