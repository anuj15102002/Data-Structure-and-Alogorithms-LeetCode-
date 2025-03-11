class Solution {
    public void rotate(int[] nums, int k) {
        //here we are creating the funciton which takes the array and
        //two points from where it has to reverse the order
        int n=nums.length;
        if(k>n)k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        
    }
    public static int[] reverse(int[] nums ,int start, int end)
        {
            while(start<end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            return nums;
        }
}