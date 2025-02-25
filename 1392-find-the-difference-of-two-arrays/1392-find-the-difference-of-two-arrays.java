class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int n:nums1)
        {
            s1.add(n);
        }

        Set<Integer> s2=new HashSet<>();
        for(int n:nums2)
        {
            s2.add(n);
        }

        for(int n:nums2){
            if(s1.contains(n)){
                s1.remove(n);
                s2.remove(n);
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>(s1));
        result.add(new ArrayList<>(s2));
        return result;
    }
}