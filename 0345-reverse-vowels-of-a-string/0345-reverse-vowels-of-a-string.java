class Solution {
    public String reverseVowels(String s) {
        int n=s.length()-1;
        int st=0;
        char[] arr=s.toCharArray();
        while(st<n)
        {
            if(!isVowel(arr[st]))st++;
            else if(!isVowel(arr[n]))n--;
            else {
                char temp=arr[st];
                arr[st]=arr[n];
                arr[n]=temp;
                st++;
                n--;
            }
        }
        return String.valueOf(arr);
    }
     public static boolean isVowel(char ch)
     {
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')return true;
        return false;
     }   
    
}