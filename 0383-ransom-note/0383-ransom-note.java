class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length()<ransomNote.length())return false;

        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        Map<Character,Integer> c=new HashMap<>();
        int count=0;
        for(char n:m)
        {
            c.put(n,c.getOrDefault(n,0)+1);
        }
        for(char n:r)
        {
            if(c.containsKey(n) && c.get(n)>0)
            {
                count++;
                c.put(n,c.get(n)-1);
            }
        }
        if(count==r.length)return true;
        return false;

    }
}