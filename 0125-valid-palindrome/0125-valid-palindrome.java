class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())return true;
        char[] newString=s.toCharArray();
        int start=0;
        int end=newString.length-1;
        while(start<=end)
        {
            if(!Character.isLetterOrDigit(newString[start]))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(newString[end]))
            {
                end--;
            }
            else
            {
                if(Character.toLowerCase(newString[start]) != Character.toLowerCase(newString[end]))return false;
                start++;
                end--;
            }
            
        }
        return true;
        
    }
}