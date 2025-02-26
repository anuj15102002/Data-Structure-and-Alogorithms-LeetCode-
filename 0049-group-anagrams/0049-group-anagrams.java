class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        //we create map to store the string as key and list of string as 
        //its all anagram
        Map<String,List<String>>map =new HashMap<>();

        //first we iterate the array of string
        for(String word:strs)
        {
            //then convert the word int char array
            char[] newWord=word.toCharArray();
            //now we sort this array
            Arrays.sort(newWord);

            //now we make the string of this sorted array
            String newString=new String(newWord);

            //if the newString is not in map then we put it as key 
            //and make new ArrayList to store as List
            if(!map.containsKey(newString))
            {
                map.put(newString,new ArrayList<>());
            }

            //if newString already exists then we its an anagram
            //of previously added string as a key
            //so we add this string as anagram in list
            map.get(newString).add(word);
        }
        
        //now we return the list of all the anagram list 
        return new ArrayList<>(map.values());
    }
}