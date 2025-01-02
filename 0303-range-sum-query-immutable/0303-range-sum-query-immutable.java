class NumArray {
    private int[] ps;

    public NumArray(int[] nums) {
       int n=nums.length;
       ps=new int[n+1];
       ps[0]=nums[0];
       for(int i=1;i<n;i++){
        ps[i]=nums[i]+ps[i-1];
       }
   
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return ps[right];
        return ps[right]-ps[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */