class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            char digit = num.charAt(i);

            while(!stack.isEmpty() && k>0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0) // if k is still left then we'll remove the end of the stack characters
        {
            stack.pop();
            k--; // it also handles the case if k == num.length()
        }        

        if(stack.isEmpty())return "0";

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        //now we'll remove the 0's if there are any from the end of the sb
        while(sb.length() > 0 && sb.charAt(sb.length()-1) == '0'){
            sb.deleteCharAt(sb.length() - 1);
        }

        if(sb.length() == 0)return "0";
        sb.reverse();
        return sb.toString();
    }
}