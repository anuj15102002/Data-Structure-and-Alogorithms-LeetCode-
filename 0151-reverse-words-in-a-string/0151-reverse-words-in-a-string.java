class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        int j=words.length;
        for(int i=0;i<j/2;i++)
        {
            String temp=words[i];
            words[i]=words[j-i-1];
            words[j-i-1]=temp;
            
        }
        return String.join(" ",words);
    }
}