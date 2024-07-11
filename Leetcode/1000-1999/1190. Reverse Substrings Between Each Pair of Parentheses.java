class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        int n = s.length();
        char[] arr = s.toCharArray();

        for(int i = 0;i<n;i++){
            if(arr[i] == ')') {
                while(stk.peek() != '(') q.add(stk.pop());
                stk.pop();
                while(!q.isEmpty()) stk.push(q.remove());
            }
            else {
                stk.push(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()) sb.append(stk.pop());
        return sb.reverse().toString();
    }
}
