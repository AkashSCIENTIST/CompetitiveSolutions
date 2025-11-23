class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        boolean status = true;
        for(char i : str.toCharArray()){
            if((i == '{') || (i == '[') || (i == '(')) stack.push(i);
            else {
                if(stack.isEmpty()) return false;
                char c = stack.pop();
                if(i == '}' && c != '{') return false;
                if(i == ']' && c != '[') return false;
                if(i == ')' && c != '(') return false;
            } 
        }
        return status&&stack.isEmpty();
    }
}
