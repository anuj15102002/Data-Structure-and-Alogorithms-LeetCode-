class Solution {
    public void moveZeroes(int[] nums) {

        //we'll have a pointer at the start of the array 
       int i=0;

        //now iterate theough the nums
       for(int j=0;j<nums.length;j++){

        //check if the nums[j] is not the zero
        if(nums[j]!=0){
            //then swap the element with i index value
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            //and increase i by 1
            i++;
        }
       }
    }
}