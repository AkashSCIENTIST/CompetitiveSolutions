class Solution {
    public String removeStars(String s) {
        String arr[] = s.split("");
        Stack<String> stk = new Stack<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i].compareTo("*") == 0){
                if(!stk.isEmpty()) stk.pop();
            }
            else {
                stk.push(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        Iterator<String> itr = stk.iterator();
        while(itr.hasNext()) sb.append(itr.next());
        return sb.toString();
    }
}
