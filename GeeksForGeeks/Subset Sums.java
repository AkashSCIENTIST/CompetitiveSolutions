class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        solve(list, arr, 0, 0, n);
        return list;
    }
    
    void solve(List<Integer> list, List<Integer> arr, int sum, int idx, int n) {
        if(idx == n){
            list.add(sum);
            return;
        }
        solve(list, arr, sum, idx+1, n);
        solve(list, arr, sum+arr.get(idx), idx+1, n);
    }
}
