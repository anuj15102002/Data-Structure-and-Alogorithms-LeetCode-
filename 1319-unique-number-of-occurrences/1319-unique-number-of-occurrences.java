class Solution {
    public boolean uniqueOccurrences(int[] arr) {

    //here we make map of integer,integer two store the values and their
    //frequencies
      Map<Integer,Integer> m=new HashMap<>();
      for(int n:arr)
      {
        m.put(n,m.getOrDefault(n,0)+1);
      }

    //then make a set to to store the values of map to compare their sizes
      Set<Integer> s=new HashSet<>();
      for(int n:m.values()){
        s.add(n);
      }

    //if they match then true otherwise false
      return m.size()==s.size();
    }
}