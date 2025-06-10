class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
       for(String str:strs)
        {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String newString = new String(word);
            if(!map.containsKey(newString))
            {
                map.put(newString, new ArrayList<>());
            }
            map.get(newString).add(str);
        }
        return new ArrayList<>(map.values());

        
       
    }
}