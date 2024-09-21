class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<Integer>();
        boolean status[] = new boolean[n];
        solve(list, 1, n, status);
        return list;
    }
    public void solve(List<Integer> list, int i, int n, boolean[] status) {
        if(i > n) return;
        if(!status[i-1]) {
            list.add(i);
            status[i-1] = true;
        }
        solve(list, i*10, n, status);
        if(i%10 == 9) return;
        solve(list, i+1, n, status);
    }
}
