class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        //FIRST METHOD
        
        //first we creaet an integer array to store the occurance of all the
        //the character in magazines (a-z)
        int[] occ=new int[26];

        //now first we count occurace of each char in magazine 
        for(char ch:magazine.toCharArray())
        {
            occ[ch - 'a']++; // means char(asccci code) - 97
            //if its a then its occurance will be stored in 0th index
        }
        //then we traverse ransomNote array and decrease the occurances of
        //each char

        for(char ch:ransomNote.toCharArray())
        {
            occ[ch - 'a']--;
            if(occ[ch - 'a']<0)return false; //means there are no more char   in magazine
                                //to make the fulfill (aaa , aab)
                                //then it will go in negative
        }

        return true;


        //  SECOND METHOD WITH HASHMAP

        // if(magazine.length()<ransomNote.length())return false;

        // char[] r=ransomNote.toCharArray();
        // char[] m=magazine.toCharArray();
        // Map<Character,Integer> c=new HashMap<>();
        // int count=0;
        // for(char n:m)
        // {
        //     c.put(n,c.getOrDefault(n,0)+1);
        // }
        // for(char n:r)
        // {
        //     if(c.containsKey(n) && c.get(n)>0)
        //     {
        //         count++;
        //         c.put(n,c.get(n)-1);
        //     }
        // }
        // if(count==r.length)return true;
        // return false;

    }
}