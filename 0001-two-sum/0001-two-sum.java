class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> result=new HashMap<>();
    int[] rs=new int[2];
    for(int i=0;i<nums.length;i++){
        int s=target-nums[i];
       for(int j=i+1;j<nums.length;j++){
        if(s==nums[j]){
            rs[0]=i;
            rs[1]=j;
        }
       }
    
    }
    return rs;
    }
}