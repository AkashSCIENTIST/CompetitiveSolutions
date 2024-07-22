class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] res = new String[n];
        PriorityQueue q = new PriorityQueue<int[]>((a,b) -> b[1]-a[1]);
        for(int i = 0; i<n;i++){
            q.add(new int[]{i, heights[i]});
        }
        int temp[];
        for(int i=0;i<n;i++){
            temp = (int[])q.poll();
            res[i] = names[temp[0]];
        }
        return res;
    }
}
