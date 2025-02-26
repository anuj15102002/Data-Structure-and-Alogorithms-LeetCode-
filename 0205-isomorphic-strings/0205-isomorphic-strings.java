class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        

        //first we create map to store the original and replacement char
        Map<Character,Character> map=new HashMap<>();
        char[] original=s.toCharArray();
        char[] replacement=t.toCharArray();


        for(int i=0;i<s.length();i++)
        {
            //if map does not contains orignial char as a key then
            if(!map.containsKey(original[i]))
            {
                //if map contains replacement char as a value
                if(!map.containsValue(replacement[i])){
                    //then we put original and replacement char to map
                    map.put(original[i],replacement[i]);
                }
                //if the map contains replacement char as value then
                //we are making replacement of same char with two diff. char
                else return false;
            }
            //if map contains original char as a key
            else
            {
                //first we check if the replacement char is same or not 
                //as we in the map that is stored previously
                char v=map.get(original[i]);
                if(replacement[i]!=v)return false;
            }
        }

        //if everything goes without any trouble then
        return true;
        
    }
}