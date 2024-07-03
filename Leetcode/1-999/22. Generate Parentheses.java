import java.util.*;

class Solution {
    Stack<String> stack;
    ArrayList<String> arrlist;
    int size;
    public List<String> generateParenthesis(int n) {
        stack = new Stack<>();
        arrlist = new ArrayList<>();
        size = n;
        backTrack(0, 0);
        return arrlist;
    }
    public void backTrack(int open, int close){
        if(open==size && close==size){
            Iterator vale = stack.iterator();
            String temp = "";
            while (vale.hasNext()) {
                temp = temp + vale.next();
            }
            arrlist.add(temp);
        }
        if(open<size){
            stack.push("(");
            backTrack(open+1,close);
            stack.pop();
        }
        if(close<open){
            stack.push(")");
            backTrack(open, close+1);
            stack.pop();
        }
    }
}
