class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);







        //SECOND METHOD

        // Map<Character,Integer> map=new HashMap<>();
        // char[] ori=s.toCharArray();
        // char[] rep=t.toCharArray();
        // for(char n:rep)
        // { 
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // int count=0;
        // for(char ch:ori)
        // {
        //     if(map.containsKey(ch) && map.get(ch)>0)
        //     {
        //         map.put(ch,map.get(ch)-1);
        //     }
        //     else return false;
        // }
        // return true;
        
    }
}