class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;

        Map<Character,Character> map=new HashMap<>();
        char[] original=s.toCharArray();
        char[] replacement=t.toCharArray();


        for(int i=0;i<s.length();i++)
        {
        
            if(!map.containsKey(original[i]))
            {
                if(!map.containsValue(replacement[i])){
                    map.put(original[i],replacement[i]);
                }
                else return false;
            }
            else
            {
                char v=map.get(original[i]);
                if(replacement[i]!=v)return false;
            }
        }
        return true;
        
    }
}