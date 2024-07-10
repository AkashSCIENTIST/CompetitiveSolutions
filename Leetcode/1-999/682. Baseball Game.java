class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(String opr : operations) {
            if(opr.equals("D"))stk.push(2 * stk.peek());
            else if(opr.equals("C")) stk.pop();
            else if(opr.equals("+")){
                int b = stk.pop();
                int a = stk.pop();
                stk.push(a);
                stk.push(b);
                stk.push(a+b);
            }
            else stk.push(Integer.valueOf(opr));
        }
        int sum = 0;
        // System.out.println(stk);
        for(Iterator<Integer> itr = stk.iterator(); itr.hasNext();) sum += itr.next();
        return sum;
    }
}
