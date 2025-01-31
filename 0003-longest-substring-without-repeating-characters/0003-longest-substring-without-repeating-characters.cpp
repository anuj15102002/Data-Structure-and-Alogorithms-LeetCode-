class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxLength=0;
        int n=s.length();
        unordered_map<char,int> charSet;
        int left=0;
    
        for(int right=0;right<n;right++)
        {
            if(charSet.count(s[right])==0 || charSet[s[right]]<left)
            {
                charSet[s[right]]=right;
                maxLength=max(maxLength,right-left+1);
            }
            else 
            {
                left=charSet[s[right]]+1;
                charSet[s[right]]=right;    
            }
        }
        return maxLength;
    }
};