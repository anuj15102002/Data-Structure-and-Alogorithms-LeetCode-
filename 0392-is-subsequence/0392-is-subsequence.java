class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0, r=0;

        //we iterate till the l is less than s(length) and r < t(length)
        while(l<s.length() && r<t.length()){

            //if(char at l from s stringis euqal to char at r from t string)
            //then we increase l by 1
            if(s.charAt(l)==t.charAt(r))l++;

            //otherwise we incrase the r by 1
            r++;
        }

        //if l reach to the length of s string then 
        //then it means all the char from s string are present in t string
        if(l==s.length())return true;

        //if they are not present then l will iterate to the length 
        //of s string
        return false;
        
    }
}