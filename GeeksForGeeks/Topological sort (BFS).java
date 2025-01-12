class Solution {
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>(n);
        
        for(int i=0;i<n;i++) {
            for(Integer idx : adj.get(i)) indegree[idx]++;
        }
        
        for(int i=0;i<n;i++) if(indegree[i] == 0) q.add(i);
        
        while(!q.isEmpty()) {
            int idx = q.poll();
            list.add(idx);
            for(Integer i2 : adj.get(idx)) {
                indegree[i2]--;
                if(indegree[i2] == 0) q.add(i2);
            }
        }
        
        return list;
    }
}
