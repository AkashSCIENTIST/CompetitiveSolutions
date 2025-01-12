class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Stack<Integer> stk = new Stack<>();
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++) {
            if(!visited[i]) topoSort(adj, stk, visited, i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(n);
        while(!stk.isEmpty()) ans.add(stk.pop());
        return ans;
    }
    
    static void topoSort(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk, boolean[] visited, int idx) {
        visited[idx] = true;
        for(Integer i : adj.get(idx)) {
            if(!visited[i]) topoSort(adj, stk, visited, i);
        }
        stk.push(idx);
    }
}
