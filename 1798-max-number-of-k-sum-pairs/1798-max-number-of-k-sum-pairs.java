class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> ans=new HashMap();
        int count=0;
        for(int n:nums){
            if(ans.containsKey(k-n) && ans.get(k-n)>0){
                count++;
                ans.put(k-n,ans.get(k-n)-1);
            }
            else
            {
                ans.put(n,ans.getOrDefault(n,0)+1);
            }
        }
        return count;
        
    }
}