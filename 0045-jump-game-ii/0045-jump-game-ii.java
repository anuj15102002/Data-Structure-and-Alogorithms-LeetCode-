class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int maxJump=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            maxJump=Math.max(maxJump,i+nums[i]);
            if(i==end){
                end=maxJump;
                jump++;
            }
        }
        return jump;
    }
}