class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        char[] str = s.toCharArray();
        int x =0;
        Set<Character> set = new HashSet<>();
        for(int y=0;y<str.length;y++)
        {   
            if(!set.contains(str[y]))
            {
                set.add(str[y]);
                ans = Math.max(y - x + 1, ans);
            }
            else
            {
                while(set.contains(str[y]))
                {
                    set.remove(str[x]);
                    x++;
                }
                set.add(str[y]);
            }

           
            
        }
        return ans;
        
    }
}