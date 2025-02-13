class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> ans=new HashMap();
        int count=0;
        for(int n:nums)
        {
            int target=k-n;
            if(ans.containsKey(k-n) && ans.get(target)>0){
                count++;
                ans.put(target,ans.getOrDefault(target,0)-1);
            }
            else
            {
              ans.put(n,ans.getOrDefault(n,0)+1);

            }
        }
        return count;
    }
}