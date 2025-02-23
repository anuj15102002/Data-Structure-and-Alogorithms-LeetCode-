class Solution {
    public String mergeAlternately(String word1, String word2) {

        //we use stringBuilder to store the characters alternately
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word1.length() | i<word2.length())
        {
            //if the word1 length is not passed then we append word1 char
            //first and then char of word2 in sb until the length of both 
            //string is surpased by i

            if(i<word1.length())sb.append(word1.charAt(i));
            if(i<word2.length())sb.append(word2.charAt(i));
            i++; 
        }

        //now we convert the stringBuilder to string and returns it
        return sb.toString();
        
    }
}