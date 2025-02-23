class Solution {
    public String reverseVowels(String s) {

        //here we have to reverse the vowel positions at the same order
        //without changing the positions of now vowel characters

        //so here we use two pointer
        //start and at one at end
        //we move start pointer to the first vowel until it doesn't crosses
        //end pointer
        //move end pointer to first vowel from the right to left until it 
        //crosses start pointer
        //then swap both the vowels and increase start by 1 and decrease 
        //end by 1

        //but first string into charArray to have easy access of characters

        char[] text=s.toCharArray();
        int start=0;
        int end=text.length-1;
        String vowels="aeiouAEIOU";

        while(start<end)
        {
            //move the s pointer until it points to vowel
            while(start<end && vowels.indexOf(text[start]) == -1)start++;

            //move e pointer until it points to vowel
            while(start<end && vowels.indexOf(text[end])==-1)end--;
            
            //swap the vowels
            char temp=text[start];
            text[start]=text[end];
            text[end]=temp;

            start++;
            end--;
        }
        // return the string by creating with new keyword
        return new String(text);

        
    }
}