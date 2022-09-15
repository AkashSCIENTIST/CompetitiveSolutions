import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        boolean status = true;
        for(char i : str.toCharArray()){
            if((i == '{') || (i == '[') || (i == '(')) stack.push(i);
            else if(stack.isEmpty()){
                    status = false;
                    break;
                }
            else if(i == '}'){
                if(stack.peek() == '{') stack.pop();
                else{
                    status = false;
                    break;
                }
            }
            
            else if(i == ']'){
                if(stack.peek() == '[') stack.pop();
                else{
                    status = false;
                    break;
                }
            }
            
            else if(i == ')'){
                if(stack.peek() == '(') stack.pop();
                else{
                    status = false;
                    break;
                }
            }
            
        }
        
        return status&&stack.isEmpty();
    }
}
