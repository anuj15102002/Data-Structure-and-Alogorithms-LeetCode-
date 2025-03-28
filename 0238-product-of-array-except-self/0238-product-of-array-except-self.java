class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] ans=new int[nums.length];
       ans[0]=1;

       for(int i=1;i<nums.length;i++)
       {
        ans[i]=ans[i-1]*nums[i-1];
       }
        int preSuffix=1;
       for(int i=nums.length-2;i>=0;i--)
       {
        preSuffix*=nums[i+1];
        ans[i]*=preSuffix;
       }
       return ans;
    }
}